package com.yijiupi.mapper;

import com.yijiupi.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface OrderItemMapper {
    /**
     * 根据订单id删除订单项
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 增加订单项
     *
     * @param record
     * @return
     */
    int insert(OrderItem record);

    /**
     * 根据订单id查询订单项信息
     *
     * @param id
     * @return
     */
    OrderItem selectByPrimaryKey(Long id);

    /**
     * 修改订单项信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(OrderItem record);


}