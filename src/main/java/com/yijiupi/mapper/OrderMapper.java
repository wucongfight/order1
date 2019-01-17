package com.yijiupi.mapper;


import com.yijiupi.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface OrderMapper {
    /**
     * 根据订单id删除订单基本信息
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 增加订单基本信息
     *
     * @param record
     * @return
     */
    int insert(Order record);

    /**
     * 修改订单基本信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(Order record);

    /**
     * 根据城市id查询订单基本信息
     *
     * @param cityId
     * @return
     */
    List<Order> selectOrderByCityId(@Param(value = "cityId") Integer cityId);

    /**
     * 根据城市id，订单类型查询订单基本信息
     *
     * @param cityId
     * @param orderType
     * @return
     */
    List<Order> selectOrder(@Param(value = "cityId") Integer cityId, @Param(value = "orderType") Byte orderType);
}