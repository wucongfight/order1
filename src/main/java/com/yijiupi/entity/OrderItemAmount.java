package com.yijiupi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItemAmount {
    private Long id;

    private Long orderid;

    private BigDecimal reduceproductamount;

    private BigDecimal reducecouponamount;

    private BigDecimal reducebonusamount;

    private BigDecimal reduceorderamount;

    private BigDecimal discount;

    private BigDecimal totalamount;

    private BigDecimal payamount;

    private Integer winescore;

    private BigDecimal deliveryamount;

    private Integer salecount;

    private Integer minunittotalcount;

    private Integer sourceCount;

    private String sysremark;

    private Date lastupdatetime;

    private BigDecimal selfpickupreduceamount;

    private BigDecimal reducerewardbonusamount;

    private BigDecimal reducecouponcodeamount;

    private Date lastmodifytime;

    private BigDecimal givebonusamount;

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

    public BigDecimal getReduceproductamount() {
        return reduceproductamount;
    }

    public void setReduceproductamount(BigDecimal reduceproductamount) {
        this.reduceproductamount = reduceproductamount;
    }

    public BigDecimal getReducecouponamount() {
        return reducecouponamount;
    }

    public void setReducecouponamount(BigDecimal reducecouponamount) {
        this.reducecouponamount = reducecouponamount;
    }

    public BigDecimal getReducebonusamount() {
        return reducebonusamount;
    }

    public void setReducebonusamount(BigDecimal reducebonusamount) {
        this.reducebonusamount = reducebonusamount;
    }

    public BigDecimal getReduceorderamount() {
        return reduceorderamount;
    }

    public void setReduceorderamount(BigDecimal reduceorderamount) {
        this.reduceorderamount = reduceorderamount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getPayamount() {
        return payamount;
    }

    public void setPayamount(BigDecimal payamount) {
        this.payamount = payamount;
    }

    public Integer getWinescore() {
        return winescore;
    }

    public void setWinescore(Integer winescore) {
        this.winescore = winescore;
    }

    public BigDecimal getDeliveryamount() {
        return deliveryamount;
    }

    public void setDeliveryamount(BigDecimal deliveryamount) {
        this.deliveryamount = deliveryamount;
    }

    public Integer getSalecount() {
        return salecount;
    }

    public void setSalecount(Integer salecount) {
        this.salecount = salecount;
    }

    public Integer getMinunittotalcount() {
        return minunittotalcount;
    }

    public void setMinunittotalcount(Integer minunittotalcount) {
        this.minunittotalcount = minunittotalcount;
    }

    public Integer getSourceCount() {
        return sourceCount;
    }

    public void setSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount;
    }

    public String getSysremark() {
        return sysremark;
    }

    public void setSysremark(String sysremark) {
        this.sysremark = sysremark == null ? null : sysremark.trim();
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public BigDecimal getSelfpickupreduceamount() {
        return selfpickupreduceamount;
    }

    public void setSelfpickupreduceamount(BigDecimal selfpickupreduceamount) {
        this.selfpickupreduceamount = selfpickupreduceamount;
    }

    public BigDecimal getReducerewardbonusamount() {
        return reducerewardbonusamount;
    }

    public void setReducerewardbonusamount(BigDecimal reducerewardbonusamount) {
        this.reducerewardbonusamount = reducerewardbonusamount;
    }

    public BigDecimal getReducecouponcodeamount() {
        return reducecouponcodeamount;
    }

    public void setReducecouponcodeamount(BigDecimal reducecouponcodeamount) {
        this.reducecouponcodeamount = reducecouponcodeamount;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public BigDecimal getGivebonusamount() {
        return givebonusamount;
    }

    public void setGivebonusamount(BigDecimal givebonusamount) {
        this.givebonusamount = givebonusamount;
    }
}