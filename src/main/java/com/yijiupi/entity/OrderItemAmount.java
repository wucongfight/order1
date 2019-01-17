package com.yijiupi.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class OrderItemAmount {
    private Long id;

    private Long orderId;

    private BigDecimal reduceProductAmount;

    private BigDecimal reduceCouponAmount;

    private BigDecimal reduceBonusAmount;

    private BigDecimal reduceOrderAmount;

    private BigDecimal discount;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private Integer wineScore;

    private BigDecimal deliveryAmount;

    private Integer saleCount;

    private Integer minUnitTotalCount;

    private Integer sourceCount;

    private String sysRemark;

    private Date lastUpDateTime;

    private BigDecimal selfPickUpReduceAmount;

    private BigDecimal reduceRewardBonusAmount;

    private BigDecimal reduceCoupOnCodeAmount;

    private Date lastModifyTime;

    private BigDecimal giveBonusAmount;

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

    public BigDecimal getReduceProductAmount() {
        return reduceProductAmount;
    }

    public void setReduceProductAmount(BigDecimal reduceProductAmount) {
        this.reduceProductAmount = reduceProductAmount;
    }

    public BigDecimal getReduceCouponAmount() {
        return reduceCouponAmount;
    }

    public void setReduceCouponAmount(BigDecimal reduceCouponAmount) {
        this.reduceCouponAmount = reduceCouponAmount;
    }

    public BigDecimal getReduceBonusAmount() {
        return reduceBonusAmount;
    }

    public void setReduceBonusAmount(BigDecimal reduceBonusAmount) {
        this.reduceBonusAmount = reduceBonusAmount;
    }

    public BigDecimal getReduceOrderAmount() {
        return reduceOrderAmount;
    }

    public void setReduceOrderAmount(BigDecimal reduceOrderAmount) {
        this.reduceOrderAmount = reduceOrderAmount;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getWineScore() {
        return wineScore;
    }

    public void setWineScore(Integer wineScore) {
        this.wineScore = wineScore;
    }

    public BigDecimal getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(BigDecimal deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getMinUnitTotalCount() {
        return minUnitTotalCount;
    }

    public void setMinUnitTotalCount(Integer minUnitTotalCount) {
        this.minUnitTotalCount = minUnitTotalCount;
    }

    public Integer getSourceCount() {
        return sourceCount;
    }

    public void setSourceCount(Integer sourceCount) {
        this.sourceCount = sourceCount;
    }

    public String getSysRemark() {
        return sysRemark;
    }

    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
    }

    public Date getLastUpDateTime() {
        return lastUpDateTime;
    }

    public void setLastUpDateTime(Date lastUpDateTime) {
        this.lastUpDateTime = lastUpDateTime;
    }

    public BigDecimal getSelfPickUpReduceAmount() {
        return selfPickUpReduceAmount;
    }

    public void setSelfPickUpReduceAmount(BigDecimal selfPickUpReduceAmount) {
        this.selfPickUpReduceAmount = selfPickUpReduceAmount;
    }

    public BigDecimal getReduceRewardBonusAmount() {
        return reduceRewardBonusAmount;
    }

    public void setReduceRewardBonusAmount(BigDecimal reduceRewardBonusAmount) {
        this.reduceRewardBonusAmount = reduceRewardBonusAmount;
    }

    public BigDecimal getReduceCoupOnCodeAmount() {
        return reduceCoupOnCodeAmount;
    }

    public void setReduceCoupOnCodeAmount(BigDecimal reduceCoupOnCodeAmount) {
        this.reduceCoupOnCodeAmount = reduceCoupOnCodeAmount;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public BigDecimal getGiveBonusAmount() {
        return giveBonusAmount;
    }

    public void setGiveBonusAmount(BigDecimal giveBonusAmount) {
        this.giveBonusAmount = giveBonusAmount;
    }

    @Override
    public String toString() {
        return "OrderItemAmount{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", reduceProductAmount=" + reduceProductAmount +
                ", reduceCouponAmount=" + reduceCouponAmount +
                ", reduceBonusAmount=" + reduceBonusAmount +
                ", reduceOrderAmount=" + reduceOrderAmount +
                ", discount=" + discount +
                ", totalAmount=" + totalAmount +
                ", payAmount=" + payAmount +
                ", wineScore=" + wineScore +
                ", deliveryAmount=" + deliveryAmount +
                ", saleCount=" + saleCount +
                ", minUnitTotalCount=" + minUnitTotalCount +
                ", sourceCount=" + sourceCount +
                ", sysRemark='" + sysRemark + '\'' +
                ", lastUpDateTime=" + lastUpDateTime +
                ", selfPickUpReduceAmount=" + selfPickUpReduceAmount +
                ", reduceRewardBonusAmount=" + reduceRewardBonusAmount +
                ", reduceCoupOnCodeAmount=" + reduceCoupOnCodeAmount +
                ", lastModifyTime=" + lastModifyTime +
                ", giveBonusAmount=" + giveBonusAmount +
                '}';
    }
}