package com.yijiupi.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Orders;
import com.yijiupi.mapper.OrderItemMapper;
import com.yijiupi.mapper.OrdersMapper;
import com.yijiupi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private OrderItemMapper orderItemMapper;
    @Override
    public PageInfo<Orders> selectOrderByCityId(Integer pageNum, Integer pageSize,Integer cityId) {
        PageHelper.startPage(pageNum,pageSize);
        List<Orders> ordersList = ordersMapper.selectOrderByCityId(cityId);
        PageInfo<Orders> ordersPageInfo = new PageInfo<>(ordersList);
        return ordersPageInfo;
    }

    @Override
    @Transactional
    public int deleteByPrimaryKey(Long id) {

        int index1 = orderItemMapper.deleteByPrimaryKey(id);

        int index2 = ordersMapper.deleteByPrimaryKey(id);

        return index1*index2;
    }

    @Override
    public int updateByPrimaryKey(Orders record) {
        return ordersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int insert(Orders record) {
        return ordersMapper.insert(record);
    }
}
