package com.yijiupi;

import com.yijiupi.controller.OrderItemController;
import com.yijiupi.entity.OrderItem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YijiupiApplicationTests {

    @Test
    public void contextLoads() {
        OrderItemController orderItemController = new OrderItemController();
        Byte i =1;
        Byte q =2;
        OrderItem orderItem = new OrderItem();
        orderItem.setProducttype(i);
        orderItem.setLastmodifytime(new Date());
        orderItem.setRemark("order");
        orderItem.setCreatetime(new Date());
        orderItem.setOrderid(123L);
        orderItem.setId(1L);
        orderItem.setSourceId("1242");
        orderItem.setSourcetype(q);
        orderItemController.insterOrderItem(orderItem);


    }

}

