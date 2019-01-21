package com.yijiupi.mapper;

import com.yijiupi.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface OrderItemMapper {
    /**
     * 根据订单id删除订单项
     *
     * @param id 订单id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 增加订单项
     *
     * @param record 订单项
     * @return
     */
    int insert(OrderItem record);

    /**
     * 根据订单id查询订单项信息
     *
     * @param id 订单id
     * @return
     */
    List<OrderItem> selectByPrimaryKey(Long id);

    /**
     * 修改订单项信息
     *
     * @param record 订单项
     * @return
     */
    int updateByPrimaryKey(OrderItem record);


}