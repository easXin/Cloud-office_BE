package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TNationMapper;
import com.cloudoffice.pojo.TNation;
import com.cloudoffice.service.TNationService;
import org.springframework.stereotype.Service;

@Service
public class TNationServiceImpl extends ServiceImpl<TNationMapper, TNation> implements TNationService {

}
