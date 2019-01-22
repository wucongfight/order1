package com.yijiupi.entity;

import java.util.Date;
import java.util.List;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class OrderItem {

    private List<OrderItemAmount> orderItemAmountList;

    private List<OrderItemPrice> orderItemPriceList;

    private List<OrderItemProduct> orderItemProductList;

    private String orderItemId;

    private Long id;

    private Long orderId;

    private String remark;

    private Byte sourceType;

    private String sourceId;

    private Date createTime;

    private Byte productType;

    private Date lastModifyTime;

    public Long getId() {
        return id;
    }

    public String getOrderItemId() {
        return this.orderId.toString();
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getProductType() {
        return productType;
    }

    public void setProductType(Byte productType) {
        this.productType = productType;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public List<OrderItemAmount> getOrderItemAmountList() {
        return orderItemAmountList;
    }

    public void setOrderItemAmountList(List<OrderItemAmount> orderItemAmountList) {
        this.orderItemAmountList = orderItemAmountList;
    }

    public List<OrderItemPrice> getOrderItemPriceList() {
        return orderItemPriceList;
    }

    public void setOrderItemPriceList(List<OrderItemPrice> orderItemPriceList) {
        this.orderItemPriceList = orderItemPriceList;
    }

    public List<OrderItemProduct> getOrderItemProductList() {
        return orderItemProductList;
    }

    public void setOrderItemProductList(List<OrderItemProduct> orderItemProductList) {
        this.orderItemProductList = orderItemProductList;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemAmountList=" + orderItemAmountList +
                ", orderItemPriceList=" + orderItemPriceList +
                ", orderItemProductList=" + orderItemProductList +
                ", orderItemId='" + orderItemId + '\'' +
                ", id=" + id +
                ", orderId=" + orderId +
                ", remark='" + remark + '\'' +
                ", sourceType=" + sourceType +
                ", sourceId='" + sourceId + '\'' +
                ", createTime=" + createTime +
                ", productType=" + productType +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}