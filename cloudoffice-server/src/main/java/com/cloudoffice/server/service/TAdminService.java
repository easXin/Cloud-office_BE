package com.cloudoffice.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloudoffice.server.pojo.RespBean;
import com.cloudoffice.server.pojo.TAdmin;

import javax.servlet.http.HttpServletRequest;

public interface TAdminService extends IService<TAdmin> {

    RespBean login(String username, String password, HttpServletRequest request);
}
