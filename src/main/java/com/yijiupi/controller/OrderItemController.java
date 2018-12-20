package com.yijiupi.controller;

import com.yijiupi.entity.OrderItem;
import com.yijiupi.service.OrderItemService;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/orderItem")
public class OrderItemController {
    @Resource
    private OrderItemService orderItemService;
    @PostMapping
    public void insterOrderItem(OrderItem orderItem){
        System.out.println(orderItem);
        System.out.println("&&&&"+orderItemService);
        int insert = orderItemService.insert(orderItem);
        System.out.println("增加："+insert);

    }


}
