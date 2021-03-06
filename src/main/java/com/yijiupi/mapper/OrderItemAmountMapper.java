package com.yijiupi.mapper;


import com.yijiupi.entity.OrderItemAmount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface OrderItemAmountMapper {
    /**
     * 根据订单id删除优惠的产品
     *
     * @param id 订单id
     * @return
     */
    int deleteByPrimaryKey(Long id);


    /**
     * 根据订单id查询优惠产品的信息
     *
     * @param id 订单id
     * @return
     */
   List<OrderItemAmount> selectByPrimaryKey(Long id);


}