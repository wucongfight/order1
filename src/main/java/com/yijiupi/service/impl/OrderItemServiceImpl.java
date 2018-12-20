package com.yijiupi.service.impl;

import com.yijiupi.entity.OrderItem;
import com.yijiupi.mapper.OrderItemMapper;
import com.yijiupi.service.OrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
@Transactional
@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Resource
    private OrderItemMapper orderItemMapper;
    @Override
    public int insert(OrderItem record) {
        return orderItemMapper.insert(record);
    }
}
