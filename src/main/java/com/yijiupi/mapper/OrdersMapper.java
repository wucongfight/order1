package com.yijiupi.mapper;


import com.yijiupi.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrdersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Orders record);

    int insertSelective(Orders record);

    Orders selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    /**
     * @param cityId
     * @return 订单基本信息
     */
    List<Orders> selectOrderByCityId(@Param(value = "cityId") Integer cityId);


    List<Orders> selectOrder(@Param(value = "cityId") Integer cityId,@Param(value = "ordertype") Byte ordertype);
}