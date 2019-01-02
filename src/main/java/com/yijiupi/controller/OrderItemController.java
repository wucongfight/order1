package com.yijiupi.controller;
import com.yijiupi.entity.OrderDetail;
import com.yijiupi.entity.OrderItem;
import com.yijiupi.service.OrderItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;

@Controller
@RequestMapping("/orderItem")
public class OrderItemController {
    @Resource
    private OrderItemService orderItemService;

    /**
     * 根据订单id查询订单项的详细信息（订单金额，产品，单价）
     * @param
     * @return
     */

@GetMapping("/order/detail/{id}")
public ResponseEntity<OrderDetail> queryOrderItem(@PathVariable Long id){
    System.out.println(id);
    System.out.println("进来了123....");
    OrderDetail orderDetail = this.orderItemService.selectByPrimaryKey(id);
    System.out.println(orderDetail);
    if ( orderDetail == null ) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return ResponseEntity.ok(orderDetail);
}

    /**
     * 增加订单基本信息
     * @param orderItem
     * @return
     */
    @PostMapping("/order/add")
    public ResponseEntity<Void> saveOrder(@RequestBody OrderItem orderItem){
        System.out.println("增加了："+orderItem);
        this.orderItemService.insert(orderItem);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
