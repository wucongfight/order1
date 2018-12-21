package com.yijiupi.controller;

import com.github.pagehelper.PageInfo;
import com.yijiupi.entity.Orders;
import com.yijiupi.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Order")
public class OrderController {

    private OrderService orderService;

    /**
     *根据城市Id ,分页查询城市基本信息
     * @param pageNum
     * @param pageSize
     * @param cityId
     * @return
     */

@GetMapping()
public ResponseEntity<PageInfo> queryOrderByCityId(@RequestParam Integer pageNum, @RequestParam Integer pageSize, @RequestParam Integer cityId) {
          pageSize = 2;
    try {
        PageInfo<Orders> ordersPageInfo = orderService.selectOrderByCityId(pageNum, pageSize, cityId);
        if (null == ordersPageInfo) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.ok(ordersPageInfo);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
}



  public ResponseEntity<Void> saveOrder(Orders orders){



      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
  }

}
