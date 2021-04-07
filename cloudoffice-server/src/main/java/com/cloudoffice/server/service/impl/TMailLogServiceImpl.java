package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TMailLogMapper;
import com.cloudoffice.pojo.TMailLog;
import com.cloudoffice.service.TMailLogService;
import org.springframework.stereotype.Service;

@Service
public class TMailLogServiceImpl extends ServiceImpl<TMailLogMapper, TMailLog> implements TMailLogService {

}
