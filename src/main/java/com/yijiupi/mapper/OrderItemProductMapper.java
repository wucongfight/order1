package com.yijiupi.mapper;


import com.yijiupi.entity.OrderItemProduct;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderItemProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItemProduct record);

    int insertSelective(OrderItemProduct record);

    OrderItemProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemProduct record);

    int updateByPrimaryKey(OrderItemProduct record);
}