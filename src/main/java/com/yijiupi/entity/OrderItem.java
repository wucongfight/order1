package com.yijiupi.entity;

import java.util.Date;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class OrderItem {
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

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
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