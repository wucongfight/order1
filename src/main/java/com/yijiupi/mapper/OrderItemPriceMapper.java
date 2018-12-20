package com.yijiupi.mapper;

import com.yijiupi.entity.OrderItemPrice;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemPriceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItemPrice record);

    int insertSelective(OrderItemPrice record);

    OrderItemPrice selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemPrice record);

    int updateByPrimaryKey(OrderItemPrice record);
}