package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.cloudoffice.server.config.security.JwtTokenUtil;
import com.cloudoffice.server.mapper.TAdminMapper;
import com.cloudoffice.server.pojo.RespBean;
import com.cloudoffice.server.pojo.TAdmin;
import com.cloudoffice.server.service.TAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Service
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper, TAdmin> implements TAdminService {

    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @Value("${jwt.tokenHead}")
    private String tokenHead;
    @Override
    public RespBean login(String username, String password, HttpServletRequest request) {
        // use loadUserByUsername of security framework for the login feature
        UserDetails userDetailss = userDetailsService.loadUserByUsername(username);
        if(userDetails==null || !passwordEncoder.matches(password,userDetails.getPassword())){
            return RespBean.error("Wrong password");
        }
        if(!userDetails.isEnabled()){
            return RespBean.error("Account is banned, please context me");
        }
        // refresh security user
        UsernamePasswordAuthenticationToken userPwAuthToken
                = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        SecurityContextHolder.getContext().setAuthentication(userPwAuthToken);
        // login successful, then inject jwt token
        String token = jwtTokenUtil.generateToken(userDetails);
        Map<String,String> tokenMap = new HashMap<>();
        tokenMap.put("token",token);
        tokenMap.put("tokenHead",tokenHead);
        return RespBean.success("Login Successful",tokenMap);
    }
}
