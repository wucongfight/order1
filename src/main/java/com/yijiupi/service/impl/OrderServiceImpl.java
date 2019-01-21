package com.yijiupi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Order;
import com.yijiupi.mapper.OrderItemMapper;
import com.yijiupi.mapper.OrderMapper;
import com.yijiupi.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Service
public class OrderServiceImpl implements OrderService {

    private OrderMapper orderMapper;

    private OrderItemMapper orderItemMapper;

    @Resource
    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @Resource
    public void setOrderItemMapper(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Override
    public PageInfo<Order> selectOrderByCityId(Integer pageNum, Integer pageSize, Integer cityId) {
        PageHelper.startPage(pageNum, pageSize);
        List<Order> orderList = orderMapper.selectOrderByCityId(cityId);
        PageInfo<Order> orderPageInfo = new PageInfo<>(orderList);
        return orderPageInfo;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Long id) {
        int index1 = orderItemMapper.deleteByPrimaryKey(id);
        int index2 = orderMapper.deleteByPrimaryKey(id);
        return index1 * index2;
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    @Override
    public List<Order> selectOrder(Integer cityId, Byte orderType) {
        return orderMapper.selectOrder(cityId, orderType);
    }

    @Override
    public Order selectById(Long id) {
        return orderMapper.selectById(id);
    }
}
