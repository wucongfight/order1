package com.yijiupi.mapper;

import com.yijiupi.entity.OrderItemPrice;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface OrderItemPriceMapper {
    /**
     * 根据订单id删除订单金额
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 根据id查询订单金额信息
     *
     * @param id
     * @return
     */
    OrderItemPrice selectByPrimaryKey(Long id);


}