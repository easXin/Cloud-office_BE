package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TAdminMapper;
import com.cloudoffice.pojo.TAdmin;
import com.cloudoffice.service.TAdminService;
import org.springframework.stereotype.Service;

@Service
public class TAdminServiceImpl extends ServiceImpl<TAdminMapper, TAdmin> implements TAdminService {

}
