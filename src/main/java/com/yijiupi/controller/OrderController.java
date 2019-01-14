package com.yijiupi.controller;

import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Orders;
import com.yijiupi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/orderItem")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     *条件查询
     * @param orderType
     * @param cityId
     * @return
     */
    @GetMapping("/orders/{orderType}/{cityId}")
public ResponseEntity<List> queryOrder(@PathVariable (value = "orderType") Byte orderType,  @PathVariable(value = "cityId") Integer cityId) {
    System.out.println("进来了");
    System.out.println("orderType"+orderType);
    System.out.println("cityId"+cityId);
    if( cityId == null){
        cityId = 0;
    }
   if ( orderType == null){
        orderType =0;
   }
    List<Orders> orders = this.orderService.selectOrders(cityId, orderType);
    System.out.println(orders);
    return ResponseEntity.ok(orders);
}


    /**
     * 增加订单基本信息
     * @param orders
     * @return
     */
  @PostMapping("/order")
  public ResponseEntity<Void> saveOrder(@RequestBody Orders orders){
      System.out.println(orders);
    this.orderService.insert(orders);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }


    /**
     * 修改订单基本信息
     * @param orders
     * @return
     */

  @PutMapping("/order")
  public ResponseEntity<Void> updateOrder(@RequestBody Orders orders){
      System.out.println(orders);
    this.orderService.updateByPrimaryKey(orders);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }


    /**
     * 根据id 删除订单基本信息
     * @param id
     * @return
     */

   @DeleteMapping  ("/order/delete/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable(value = "id") Long id){
       System.out.println("删除了"+id);
       this.orderService.deleteByPrimaryKey(id);
       return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     *根据城市Id ,分页查询城市基本信息
     * @param pageNum
     * @param pageSize
     * @param cityId
     * @return
     */

    @GetMapping("/order/{pageNu}/{cityId}")
    public ResponseEntity<PageInfo> queryOrderByCityId(@PathVariable (value = "pageNu") Integer pageNum, @RequestParam(value = "pageSize",defaultValue = "100") Integer pageSize, @PathVariable(value = "cityId") Integer cityId) {
        System.out.println("进来了");
        System.out.println("pageNum"+pageNum);
        System.out.println("pageSize"+pageSize);
        System.out.println("cityId"+cityId);
        if( cityId == null){
            cityId = 0;
        }
        PageInfo<Orders> ordersPageInfo = this.orderService.selectOrderByCityId(pageNum, pageSize, cityId);
        System.out.println(ordersPageInfo);
        if (ordersPageInfo == null || ordersPageInfo.getList().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(ordersPageInfo);
    }

}
