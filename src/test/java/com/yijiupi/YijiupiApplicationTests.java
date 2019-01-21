package com.yijiupi;

import com.github.pagehelper.PageInfo;
import com.yijiupi.controller.OrderItemController;
import com.yijiupi.entity.Order;
import com.yijiupi.entity.OrderItem;
import com.yijiupi.service.OrderItemService;
import com.yijiupi.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YijiupiApplicationTests {
    @Autowired
    private OrderItemController orderItemController;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderItemService orderItemService;

    @Test
    public void contextLoads() {
        System.out.println("对象：" + orderItemController);
        Byte i = 1;
        Byte q = 2;
        OrderItem orderItem = new OrderItem();
        orderItem.setProductType(i);

        orderItem.setLastModifyTime(new Date());
        orderItem.setRemark("order");
        orderItem.setCreateTime(new Date());
        orderItem.setOrderId(123L);
        orderItem.setId(2L);
        orderItem.setSourceId("1242");
        orderItem.setSourceType(q);


    }


    @Test
    public void OrderShow() {
        PageInfo<Order> order = orderService.selectOrderByCityId(1, 15, 1000);
        Long num = 60L;
        for (int i = 0; i < order.getList().size(); i++) {
            order.getList().get(i).setId(num);
            order.getList().get(i).setCityId(1000);
            order.getList().get(i).setOrderNo(num.toString());
            orderService.insert(order.getList().get(i));
            System.out.println(order.getList().get(i));
            num++;
        }

    }


}


