package com.yijiupi.controller;

import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Order;
import com.yijiupi.service.OrderService;
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
public class OrderController {

    private OrderService orderService;

    @Resource
    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * 条件查询
     *
     * @param orderType 订单类型
     * @param cityId    城市id
     * @return
     */
    @GetMapping("/orders/{orderType}/{cityId}")
    public ResponseEntity<List> queryOrder(@PathVariable(value = "orderType") Byte orderType, @PathVariable(value = "cityId") Integer cityId) {
        if (cityId == null) {
            cityId = 0;
        }
        if (orderType == null) {
            orderType = -1;
        }
        List<Order> order = this.orderService.selectOrder(cityId, orderType);
        return ResponseEntity.ok(order);
    }


    /**
     * 增加订单基本信息
     *
     * @param order 订单
     * @return
     */
    @PostMapping("/order")
    public ResponseEntity<Void> saveOrder(@RequestBody Order order) {
        this.orderService.insert(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     * 修改订单基本信息
     *
     * @param order 订单
     * @return
     */
    @PutMapping("/order")
    public ResponseEntity<Void> updateOrder(@RequestBody Order order) {
        this.orderService.updateByPrimaryKey(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     * 根据id 删除订单基本信息
     *
     * @param id 主键
     * @return
     */
    @DeleteMapping("/order/delete/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable(value = "id") Long id) {
        this.orderService.deleteByPrimaryKey(id);
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
        PageInfo<Order> orderPageInfo = this.orderService.selectOrderByCityId(pageNum, pageSize, cityId);
        if (orderPageInfo == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(orderPageInfo);
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/order/update/{id}")
    public ResponseEntity<Order> selectById(@PathVariable(value = "id") Long id) {
        Order order = this.orderService.selectById(id);
        return ResponseEntity.ok(order);
    }
}
