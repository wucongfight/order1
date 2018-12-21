package com.yijiupi.service;

import com.yijiupi.entity.OrderDetail;
import com.yijiupi.entity.OrderItem;

public interface OrderItemService {

    int insert(OrderItem record);

    int deleteByPrimaryKey(Long id);

    OrderDetail selectByPrimaryKey(Long id);
}
