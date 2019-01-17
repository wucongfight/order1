package com.yijiupi.controller;

import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Order;
import com.yijiupi.service.Orderervice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */

@Controller
@RequestMapping("/orderItem")
public class OrderController {
    @Autowired
    private Orderervice orderervice;

    /**
     * 条件查询
     *
     * @param orderType 订单类型
     * @param cityId    城市
     * @return
     */
    @GetMapping("/orders/{orderType}/{cityId}")
    public ResponseEntity<List> queryOrder(@PathVariable(value = "orderType") Byte orderType, @PathVariable(value = "cityId") Integer cityId) {
        System.out.println("进来了");
        System.out.println("orderType" + orderType);
        System.out.println("cityId" + cityId);
        if (cityId == null) {
            cityId = 0;
        }
        if (orderType == null) {
            orderType = 0;
        }
        List<Order> Order = this.orderervice.selectOrder(cityId, orderType);
        System.out.println(Order);
        return ResponseEntity.ok(Order);
    }


    /**
     * 增加订单基本信息
     *
     * @param Order 订单
     * @return
     */
    @PostMapping("/order")
    public ResponseEntity<Void> saveOrder(@RequestBody Order Order) {
        System.out.println(Order);
        this.orderervice.insert(Order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     * 修改订单基本信息
     *
     * @param Order 订单
     * @return
     */
    @PutMapping("/order")
    public ResponseEntity<Void> updateOrder(@RequestBody Order Order) {
        System.out.println(Order);
        this.orderervice.updateByPrimaryKey(Order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     * 根据id 删除订单基本信息
     *
     * @param id
     * @return
     */
    @DeleteMapping("/order/delete/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable(value = "id") Long id) {
        System.out.println("删除了" + id);
        this.orderervice.deleteByPrimaryKey(id);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     * 根据城市Id ,分页查询城市基本信息
     *
     * @param pageNum  当前页码
     * @param pageSize 每页的条数
     * @param cityId   城市id
     * @return
     */
    @GetMapping("/order/{pageNu}/{cityId}")
    public ResponseEntity<PageInfo> queryOrderByCityId(@PathVariable(value = "pageNu") Integer pageNum, @RequestParam(value = "pageSize", defaultValue = "100") Integer pageSize, @PathVariable(value = "cityId") Integer cityId) {
        if (cityId == null) {
            cityId = 0;
        }
        PageInfo<Order> OrderPageInfo = this.orderervice.selectOrderByCityId(pageNum, pageSize, cityId);
        if (OrderPageInfo == null || OrderPageInfo.getList().size() == 0) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(OrderPageInfo);
    }

}
