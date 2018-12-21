package com.yijiupi.service.impl;

import com.yijiupi.entity.*;
import com.yijiupi.mapper.OrderItemAmountMapper;
import com.yijiupi.mapper.OrderItemMapper;
import com.yijiupi.mapper.OrderItemPriceMapper;
import com.yijiupi.mapper.OrderItemProductMapper;
import com.yijiupi.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class OrderItemServiceImpl implements OrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Autowired
    private OrderItemAmountMapper orderItemAmountMapper;
    @Autowired
    private OrderItemPriceMapper orderItemPriceMapper;
    @Autowired
    private OrderItemProductMapper orderItemProductMapper;

    @Override
    public int insert(OrderItem record) {
        return orderItemMapper.insert(record);
    }

    @Transactional
    @Override
    public int deleteByPrimaryKey(Long id) {

        int index1 = orderItemAmountMapper.deleteByPrimaryKey(id);

        int index2 = orderItemPriceMapper.deleteByPrimaryKey(id);

        int index3 = orderItemProductMapper.deleteByPrimaryKey(id);

        int index4 = orderItemMapper.deleteByPrimaryKey(id);

        return index1*index2*index3*index4;
    }

    @Override
    public OrderDetail selectByPrimaryKey(Long id) {

        OrderItem orderItem = orderItemMapper.selectByPrimaryKey(id);

        OrderItemProduct orderItemProduct = orderItemProductMapper.selectByPrimaryKey(id);

        OrderItemPrice orderItemPrice = orderItemPriceMapper.selectByPrimaryKey(id);

        OrderItemAmount orderItemAmount = orderItemAmountMapper.selectByPrimaryKey(id);

       return new OrderDetail(orderItem,orderItemPrice,orderItemAmount,orderItemProduct);

    }
}
