package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TSalaryMapper;
import com.cloudoffice.pojo.TSalary;
import com.cloudoffice.service.TSalaryService;
import org.springframework.stereotype.Service;

@Service
public class TSalaryServiceImpl extends ServiceImpl<TSalaryMapper, TSalary> implements TSalaryService {

}
