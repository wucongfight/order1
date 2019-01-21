package com.yijiupi.mapper;


import com.yijiupi.entity.OrderItemProduct;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface OrderItemProductMapper {
    /**
     * 根据订单id删除订单产品信息
     *
     * @param id 订单id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据订单id删除订单产品信息
     *
     * @param id 订单id
     * @return
     */
   List<OrderItemProduct> selectByPrimaryKey(Long id);


}