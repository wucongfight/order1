package com.yijiupi;

import com.github.pagehelper.PageInfo;
import com.yijiupi.controller.OrderItemController;
import com.yijiupi.entity.Order;
import com.yijiupi.entity.OrderDetail;
import com.yijiupi.entity.OrderItem;
import com.yijiupi.service.OrderItemService;
import com.yijiupi.service.Orderervice;
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
    private Orderervice Orderervice;
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
        PageInfo<Order> Order = Orderervice.selectOrderByCityId(1, 15, 1000);
        Long num = 60L;
        for (int i = 0; i < Order.getList().size(); i++) {
            Order.getList().get(i).setId(num);
            Order.getList().get(i).setCityId(1000);
            Order.getList().get(i).setOrderNo(num.toString());
            Orderervice.insert(Order.getList().get(i));
            System.out.println(Order.getList().get(i));
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

}


