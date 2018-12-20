package com.yijiupi.mapper;


import com.yijiupi.entity.OrderItemAmount;
import org.apache.ibatis.annotations.Mapper;
@Mapper
public interface OrderItemAmountMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderItemAmount record);

    int insertSelective(OrderItemAmount record);

    OrderItemAmount selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderItemAmount record);

    int updateByPrimaryKey(OrderItemAmount record);
}