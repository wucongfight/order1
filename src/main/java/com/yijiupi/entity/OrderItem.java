package com.yijiupi.entity;

import java.util.Date;

public class OrderItem {
    private Long id;

    private Long orderid;

    private String remark;

    private Byte sourcetype;

    private String sourceId;

    private Date createtime;

    private Byte producttype;

    private Date lastmodifytime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderid() {
        return orderid;
    }

    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getSourcetype() {
        return sourcetype;
    }

    public void setSourcetype(Byte sourcetype) {
        this.sourcetype = sourcetype;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Byte getProducttype() {
        return producttype;
    }

    public void setProducttype(Byte producttype) {
        this.producttype = producttype;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderid=" + orderid +
                ", remark='" + remark + '\'' +
                ", sourcetype=" + sourcetype +
                ", sourceId='" + sourceId + '\'' +
                ", createtime=" + createtime +
                ", producttype=" + producttype +
                ", lastmodifytime=" + lastmodifytime +
                '}';
    }
}