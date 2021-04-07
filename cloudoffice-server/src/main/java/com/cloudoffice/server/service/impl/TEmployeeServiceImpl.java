package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TEmployeeMapper;
import com.cloudoffice.pojo.TEmployee;
import com.cloudoffice.service.TEmployeeService;
import org.springframework.stereotype.Service;


@Service
public class TEmployeeServiceImpl extends ServiceImpl<TEmployeeMapper, TEmployee> implements TEmployeeService {

}
