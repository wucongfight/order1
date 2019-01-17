package com.yijiupi.entity;


/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */


public class OrderDetail {


    public OrderDetail() {
    }

    public OrderDetail(OrderItem orderItem, OrderItemPrice orderItemPrice, OrderItemAmount orderItemAmount, OrderItemProduct orderItemProduct) {
        this.orderItem = orderItem;
        this.orderItemPrice = orderItemPrice;
        this.orderItemAmount = orderItemAmount;
        this.orderItemProduct = orderItemProduct;
    }

    private OrderItem orderItem;

    private OrderItemPrice orderItemPrice;

    private OrderItemAmount orderItemAmount;

    private OrderItemProduct orderItemProduct;

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public OrderItemPrice getOrderItemPrice() {
        return orderItemPrice;
    }

    public OrderItemAmount getOrderItemAmount() {
        return orderItemAmount;
    }

    public OrderItemProduct getOrderItemProduct() {
        return orderItemProduct;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public void setOrderItemPrice(OrderItemPrice orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public void setOrderItemAmount(OrderItemAmount orderItemAmount) {
        this.orderItemAmount = orderItemAmount;
    }

    public void setOrderItemProduct(OrderItemProduct orderItemProduct) {
        this.orderItemProduct = orderItemProduct;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderItem=" + orderItem +
                ", orderItemPrice=" + orderItemPrice +
                ", orderItemAmount=" + orderItemAmount +
                ", orderItemProduct=" + orderItemProduct +
                '}';
    }
}
