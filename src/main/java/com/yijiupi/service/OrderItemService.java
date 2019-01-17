package com.yijiupi.service;

import com.yijiupi.entity.OrderDetail;
import com.yijiupi.entity.OrderItem;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public interface OrderItemService {
    /**
     * 增加订单项
     *
     * @param record 订单项
     * @return
     */
    int insert(OrderItem record);

    /**
     * 根据订单id删除与订单项的有关的订单
     *
     * @param id 订单id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据订单id查询与订单项有关的订单信息
     *
     * @param id 订单id
     * @return
     */
    OrderDetail selectByPrimaryKey(Long id);

    /**
     * 根据订单id查询订单项的信息
     *
     * @param id 订单id
     * @return
     */
    OrderItem selectById(Long id);

}
