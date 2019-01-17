package com.yijiupi.service;

import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Order;

import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public interface Orderervice {
    /**
     * 分页查询订单基本信息
     *
     * @param pageNum 当前页码
     * @param pageSize 每页条数
     * @param cityId 城市id
     * @return
     */
    PageInfo<Order> selectOrderByCityId(Integer pageNum, Integer pageSize, Integer cityId);

    /**
     * 根据主键删除订单基本信息
     *
     * @param id 主键
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 修改订单基本信息
     *
     * @param record 订单
     * @return
     */
    int updateByPrimaryKey(Order record);

    /**
     * 增加订单基本信息
     *
     * @param record 订单
     * @return
     */
    int insert(Order record);

    /**
     * 按条件查询订单信息
     *
     * @param cityId 城市id
     * @param orderType 订单类型
     * @return
     */
    List<Order> selectOrder(Integer cityId, Byte orderType);
}
