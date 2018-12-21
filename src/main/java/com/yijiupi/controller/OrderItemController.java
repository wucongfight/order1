package com.yijiupi.controller;

import com.yijiupi.entity.OrderItem;
import com.yijiupi.service.OrderItemService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/OrderItem")
public class OrderItemController {
    @Resource
    private OrderItemService orderItemService;
    @PostMapping
    public void insterOrderItem(OrderItem orderItem){
        int insert = orderItemService.insert(orderItem);

    }


}
