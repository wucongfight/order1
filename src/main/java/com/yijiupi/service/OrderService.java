package com.yijiupi.service;

import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Orders;


public interface OrderService {
    PageInfo<Orders> selectOrderByCityId(Integer pageNum, Integer pageSize, Integer cityId);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKey(Orders record);

    int insert(Orders record);
}
