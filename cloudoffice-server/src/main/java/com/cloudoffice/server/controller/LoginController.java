package com.cloudoffice.server.controller;

import com.cloudoffice.server.pojo.AdminLoginParam;
import com.cloudoffice.server.pojo.RespBean;
import com.cloudoffice.server.service.TAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "LoginController") // swagger annotation
@RestController
public class LoginController {

    @Autowired
    private TAdminService adminService;

    @ApiOperation(value = "return token after login")
    @PostMapping("/login")
    public RespBean login(AdminLoginParam adminLoginParam, HttpServletRequest request){
        return adminService.login(adminLoginParam.getUsername(), adminLoginParam.getPassword(), request);
    }
}
