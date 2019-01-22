package com.yijiupi.service.impl;

import com.yijiupi.entity.OrderItem;
import com.yijiupi.entity.OrderItemAmount;
import com.yijiupi.entity.OrderItemPrice;
import com.yijiupi.entity.OrderItemProduct;
import com.yijiupi.mapper.OrderItemAmountMapper;
import com.yijiupi.mapper.OrderItemMapper;
import com.yijiupi.mapper.OrderItemPriceMapper;
import com.yijiupi.mapper.OrderItemProductMapper;
import com.yijiupi.service.OrderItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Service
public class OrderItemServiceImpl implements OrderItemService {

    private OrderItemMapper orderItemMapper;

    private OrderItemAmountMapper orderItemAmountMapper;

    private OrderItemPriceMapper orderItemPriceMapper;

    private OrderItemProductMapper orderItemProductMapper;

    @Resource
    public void setOrderItemMapper(OrderItemMapper orderItemMapper) {
        this.orderItemMapper = orderItemMapper;
    }

    @Resource
    public void setOrderItemAmountMapper(OrderItemAmountMapper orderItemAmountMapper) {
        this.orderItemAmountMapper = orderItemAmountMapper;
    }

    @Resource
    public void setOrderItemPriceMapper(OrderItemPriceMapper orderItemPriceMapper) {
        this.orderItemPriceMapper = orderItemPriceMapper;
    }

    @Resource
    public void setOrderItemProductMapper(OrderItemProductMapper orderItemProductMapper) {
        this.orderItemProductMapper = orderItemProductMapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insert(OrderItem orderItem) {
        List<OrderItem> orderItemList = orderItemMapper.selectByPrimaryKey(orderItem.getId());
        if (orderItemList.size() != 0) {
            return orderItemMapper.updateByPrimaryKey(orderItem);
        } else {
            return orderItemMapper.insert(orderItem);
        }
    }


    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteByPrimaryKey(Long id) {
        int index1 = 1;
        int index2 = 1;
        int index3 = 1;
        int index4 = 1;
        List<OrderItem> orderItemList = orderItemMapper.selectByPrimaryKey(id);
        List<OrderItemProduct> orderItemProductList = orderItemProductMapper.selectByPrimaryKey(id);
        List<OrderItemPrice> orderItemPriceList = orderItemPriceMapper.selectByPrimaryKey(id);
        List<OrderItemAmount> orderItemAmountList = orderItemAmountMapper.selectByPrimaryKey(id);
        if (orderItemAmountList != null) {
            index1 = orderItemAmountMapper.deleteByPrimaryKey(id);
        }
        if (orderItemPriceList != null) {
            index2 = orderItemPriceMapper.deleteByPrimaryKey(id);
        }
        if (orderItemProductList != null) {
            index3 = orderItemProductMapper.deleteByPrimaryKey(id);
        }
        if (orderItemList != null) {
            index4 = orderItemMapper.deleteByPrimaryKey(id);
        }
        return index1 * index2 * index3 * index4;
    }

    @Override
    public List<OrderItem> selectByPrimaryKey(Long id) {
        List<OrderItem> orderItemList = orderItemMapper.selectByPrimaryKey(id);
        for (OrderItem anOrderItemList : orderItemList) {
            List<OrderItemProduct> orderItemProductList = orderItemProductMapper.selectByPrimaryKey(anOrderItemList.getId());
            List<OrderItemPrice> orderItemPriceList = orderItemPriceMapper.selectByPrimaryKey(anOrderItemList.getId());
            List<OrderItemAmount> orderItemAmountList = orderItemAmountMapper.selectByPrimaryKey(anOrderItemList.getId());
            anOrderItemList.setOrderItemAmountList(orderItemAmountList);
            anOrderItemList.setOrderItemPriceList(orderItemPriceList);
            anOrderItemList.setOrderItemProductList(orderItemProductList);
        }

        return orderItemList ;

    }

    @Override
    public List<OrderItem> selectById(Long id) {
        return orderItemMapper.selectByPrimaryKey(id);
    }

}
