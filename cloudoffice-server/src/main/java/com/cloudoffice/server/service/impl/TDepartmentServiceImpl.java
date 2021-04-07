package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TDepartmentMapper;
import com.cloudoffice.pojo.TDepartment;
import com.cloudoffice.service.TDepartmentService;
import org.springframework.stereotype.Service;

@Service
public class TDepartmentServiceImpl extends ServiceImpl<TDepartmentMapper, TDepartment> implements TDepartmentService {

}
