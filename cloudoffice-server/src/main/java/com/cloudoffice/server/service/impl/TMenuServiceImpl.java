package com.cloudoffice.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloudoffice.mapper.TMenuMapper;
import com.cloudoffice.pojo.TMenu;
import com.cloudoffice.service.TMenuService;
import org.springframework.stereotype.Service;

@Service
public class TMenuServiceImpl extends ServiceImpl<TMenuMapper, TMenu> implements TMenuService {

}
