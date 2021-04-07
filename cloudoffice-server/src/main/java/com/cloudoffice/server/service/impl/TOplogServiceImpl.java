package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TOplogMapper;
import com.cloudoffice.pojo.TOplog;
import com.cloudoffice.service.TOplogService;
import org.springframework.stereotype.Service;

@Service
public class TOplogServiceImpl extends ServiceImpl<TOplogMapper, TOplog> implements TOplogService {

}
