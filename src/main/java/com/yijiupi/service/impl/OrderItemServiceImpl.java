package com.yijiupi.service.impl;

import com.yijiupi.entity.*;
import com.yijiupi.mapper.OrderItemAmountMapper;
import com.yijiupi.mapper.OrderItemMapper;
import com.yijiupi.mapper.OrderItemPriceMapper;
import com.yijiupi.mapper.OrderItemProductMapper;
import com.yijiupi.service.OrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

    private OrderItemMapper orderItemMapper;

    private OrderItemAmountMapper orderItemAmountMapper;

    private OrderItemPriceMapper orderItemPriceMapper;

    private OrderItemProductMapper orderItemProductMapper;

    @Resource
    public void setOrderItemMapper(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Resource
    public void setOrderItemAmountMapper(OrderItemAmountMapper orderItemAmountMapper) {
        this.orderItemAmountMapper = orderItemAmountMapper;
    }

    @Resource
    public void setOrderItemPriceMapper(OrderItemPriceMapper orderItemPriceMapper) {
        this.orderItemPriceMapper = orderItemPriceMapper;
    }

    @Resource
    public void setOrderItemProductMapper(OrderItemProductMapper orderItemProductMapper) {
        this.orderItemProductMapper = orderItemProductMapper;
    }

    @Override
    public int insert(OrderItem orderItem) {
        OrderItem orderItem1 = orderItemMapper.selectByPrimaryKey(orderItem.getId());
        if (orderItem1 != null) {
            return orderItemMapper.updateByPrimaryKey(orderItem);
        } else {
            return orderItemMapper.insert(orderItem);
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Long id) {
        int index1 = 1;
        int index2 = 1;
        int index3 = 1;
        int index4 = 1;
        OrderItem orderItem = orderItemMapper.selectByPrimaryKey(id);
        OrderItemAmount orderItemAmount = orderItemAmountMapper.selectByPrimaryKey(id);
        OrderItemPrice orderItemPrice = orderItemPriceMapper.selectByPrimaryKey(id);
        OrderItemProduct orderItemProduct = orderItemProductMapper.selectByPrimaryKey(id);
        if (orderItemAmount != null) {
            index1 = orderItemAmountMapper.deleteByPrimaryKey(id);
        }
        if (orderItemPrice != null) {
            index2 = orderItemPriceMapper.deleteByPrimaryKey(id);
        }
        if (orderItemProduct != null) {
            index3 = orderItemProductMapper.deleteByPrimaryKey(id);
        }
        if (orderItem != null) {
            index4 = orderItemMapper.deleteByPrimaryKey(id);
        }
        return index1 * index2 * index3 * index4;
    }

    @Override
    public OrderDetail selectByPrimaryKey(Long id) {
        OrderItem orderItem = orderItemMapper.selectByPrimaryKey(id);
        OrderItemProduct orderItemProduct = orderItemProductMapper.selectByPrimaryKey(id);
        OrderItemPrice orderItemPrice = orderItemPriceMapper.selectByPrimaryKey(id);
        OrderItemAmount orderItemAmount = orderItemAmountMapper.selectByPrimaryKey(id);
        return new OrderDetail(orderItem, orderItemPrice, orderItemAmount, orderItemProduct);

    }

    @Override
    public OrderItem selectById(Long id) {
        return orderItemMapper.selectByPrimaryKey(id);
    }

}
