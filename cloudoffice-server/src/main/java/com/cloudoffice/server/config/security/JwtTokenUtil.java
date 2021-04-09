package com.cloudoffice.server.config.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JwtTokenUtil {
    private static final String CLAIM_KEY_USERNAME ="sub";
    private static final String CLAIM_KEY_CREATED_TIME = "created";
    @Value("${jwt.secret}")
    private String secret;
    @Value("${jwt.expiration}")
    private Long expiration;

    // generate a token based on the user info
    public String generateToken(UserDetails userDetails){
        HashMap<String, Object> claims = new HashMap<>();
        claims.put(CLAIM_KEY_USERNAME, userDetails.getUsername());
        claims.put(CLAIM_KEY_CREATED_TIME, new Date());
        return generateToken(claims);
    }

    private String generateToken(Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setExpiration(generateExpirationDate())
                .signWith(SignatureAlgorithm.HS512,secret)
                .compact();
    }

    private Date generateExpirationDate() {
        return new Date(System.currentTimeMillis()+expiration*1000);
    }

    public String getUserNameFromToken(String token){
        String username;
        try{
            Claims claims = getClaimFormToken(token);
            username = claims.getSubject();
        }catch (Exception e){
            username = null;
        }
        return username;
    }

    private Claims getClaimFormToken(String token) {
        Claims claims;
        try {
            claims = Jwts.parser().setSigningKey(secret).parseClaimsJwt(token).getBody();
        }catch (Exception e){
            e.printStackTrace();
            claims =null;
        }
        return claims;
    }
    
    public boolean validateToken(String token, UserDetails userDetails){
        String username = getUserNameFromToken(token);
        return username.equals(userDetails.getUsername()) && !isTokenExpired(token);
    }

    public boolean canRefresh(String token){
        return !isTokenExpired(token);
    }

    public String refreshToken(String token){
        Claims claim= getClaimFormToken(token);
        claim.put(CLAIM_KEY_CREATED_TIME,new Date());
        return generateToken(claim);
    }
    private boolean isTokenExpired(String token) {
        Date expireDate = getExpirationDateFromToken(token);
        return expireDate.before(new Date());
    }

    private Date getExpirationDateFromToken(String token) {
        Claims claims = getClaimFormToken(token);
        return  claims.getExpiration();
    }
}
