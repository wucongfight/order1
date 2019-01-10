package com.yijiupi;

import com.github.pagehelper.PageInfo;
import com.yijiupi.controller.OrderItemController;
import com.yijiupi.entity.OrderDetail;
import com.yijiupi.entity.OrderItem;
import com.yijiupi.entity.Orders;
import com.yijiupi.service.OrderItemService;
import com.yijiupi.service.OrderService;
import com.yijiupi.unit.MD5;
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
        orderItem.setProducttype(i);
        orderItem.setLastmodifytime(new Date());
        orderItem.setRemark("order");
        orderItem.setCreatetime(new Date());
        orderItem.setOrderid(123L);
        orderItem.setId(2L);
        orderItem.setSourceId("1242");
        orderItem.setSourcetype(q);


    }


    @Test
    public void OrdersShow() {
        System.out.println("对象是：" + orderService);
        PageInfo<Orders> orders = orderService.selectOrderByCityId(1, 2, 1000);
        System.out.println("集合长度：" + orders.getList().size());
        Long num = 4L;
        for (int i = 0; i < orders.getList().size(); i++) {
            System.out.println("增加：" + num);
            orders.getList().get(i).setId(num);
            orders.getList().get(i).setCityId(1000);
            orders.getList().get(i).setOrderno(num.toString());
            orderService.insert(orders.getList().get(i));
            System.out.println(orders.getList().get(i));
            num++;
        }

    }

    @Test
    public void OrderItemShow() {
        OrderDetail orderDetail = orderItemService.selectByPrimaryKey(1L);
        System.out.println("对象：" + orderDetail.getOrderItemAmount());
        System.out.println("对象：" + orderDetail.getOrderItemPrice());
        System.out.println("对象：" + orderDetail.getOrderItemProduct());
        System.out.println("对象：" + orderDetail.getOrderItem());

    }
@Test
    public void md5() {
        MD5.stringMD5("");
    }
}


