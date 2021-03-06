package com.yijiupi.controller;

import com.yijiupi.entity.OrderItem;
import com.yijiupi.service.OrderItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */

@Controller
@RequestMapping("/orderItem")
public class OrderItemController {

    private OrderItemService orderItemService;

    @Resource
    public void setOrderItemService(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    /**
     * 根据订单id查询订单项的详细信息（订单金额，产品，单价）
     *
     * @param id 订单id
     * @return
     */
    @GetMapping("/order/detail/{id}")
    public ResponseEntity<List> queryOrderItem(@PathVariable Long id) {
        List<OrderItem> orderItemList = this.orderItemService.selectByPrimaryKey(id);
        return ResponseEntity.ok(orderItemList);
    }

    /**
     * 增加订单基本信息
     *
     * @param orderItem 订单项
     * @return
     */
    @PostMapping("/order/add")
    public ResponseEntity<Void> saveOrder(@RequestBody OrderItem orderItem) {
        this.orderItemService.insert(orderItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    /**
     * 查询订单项信息
     *
     * @param id 订单id
     * @return
     */
    @GetMapping("/order/orderItem/{id}")
    public ResponseEntity<OrderItem> query(@PathVariable Long id) {
        List<OrderItem> orderItemList = this.orderItemService.selectById(id);
        System.out.println(orderItemList.get(0).getOrderItemId());
        return ResponseEntity.ok(orderItemList.get(0));
    }
}
