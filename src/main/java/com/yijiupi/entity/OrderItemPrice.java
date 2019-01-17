package com.yijiupi.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class OrderItemPrice {
    private Long id;

    private Long orderId;

    private BigDecimal originalPrice;

    private String originalPriceUnit;

    private BigDecimal costPrice;

    private String costPriceUnit;

    private BigDecimal sellPrice;

    private String sellUnit;

    private BigDecimal minUnitPrice;

    private String minUnitName;

    private BigDecimal reduceProductPrice;

    private String reduceProductPriceUnit;

    private Integer sellToMinUnitQuantity;

    private Integer maxToMinUnitQuantity;

    private Integer wineScore;

    private BigDecimal defaultSpecPrice;

    private BigDecimal selfPickUpReducePrice;

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

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    public String getOriginalPriceUnit() {
        return originalPriceUnit;
    }

    public void setOriginalPriceUnit(String originalPriceUnit) {
        this.originalPriceUnit = originalPriceUnit;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public String getCostPriceUnit() {
        return costPriceUnit;
    }

    public void setCostPriceUnit(String costPriceUnit) {
        this.costPriceUnit = costPriceUnit;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getSellUnit() {
        return sellUnit;
    }

    public void setSellUnit(String sellUnit) {
        this.sellUnit = sellUnit;
    }

    public BigDecimal getMinUnitPrice() {
        return minUnitPrice;
    }

    public void setMinUnitPrice(BigDecimal minUnitPrice) {
        this.minUnitPrice = minUnitPrice;
    }

    public String getMinUnitName() {
        return minUnitName;
    }

    public void setMinUnitName(String minUnitName) {
        this.minUnitName = minUnitName;
    }

    public BigDecimal getReduceProductPrice() {
        return reduceProductPrice;
    }

    public void setReduceProductPrice(BigDecimal reduceProductPrice) {
        this.reduceProductPrice = reduceProductPrice;
    }

    public String getReduceProductPriceUnit() {
        return reduceProductPriceUnit;
    }

    public void setReduceProductPriceUnit(String reduceProductPriceUnit) {
        this.reduceProductPriceUnit = reduceProductPriceUnit;
    }

    public Integer getSellToMinUnitQuantity() {
        return sellToMinUnitQuantity;
    }

    public void setSellToMinUnitQuantity(Integer sellToMinUnitQuantity) {
        this.sellToMinUnitQuantity = sellToMinUnitQuantity;
    }

    public Integer getMaxToMinUnitQuantity() {
        return maxToMinUnitQuantity;
    }

    public void setMaxToMinUnitQuantity(Integer maxToMinUnitQuantity) {
        this.maxToMinUnitQuantity = maxToMinUnitQuantity;
    }

    public Integer getWineScore() {
        return wineScore;
    }

    public void setWineScore(Integer wineScore) {
        this.wineScore = wineScore;
    }

    public BigDecimal getDefaultSpecPrice() {
        return defaultSpecPrice;
    }

    public void setDefaultSpecPrice(BigDecimal defaultSpecPrice) {
        this.defaultSpecPrice = defaultSpecPrice;
    }

    public BigDecimal getSelfPickUpReducePrice() {
        return selfPickUpReducePrice;
    }

    public void setSelfPickUpReducePrice(BigDecimal selfPickUpReducePrice) {
        this.selfPickUpReducePrice = selfPickUpReducePrice;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    @Override
    public String toString() {
        return "OrderItemPrice{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", originalPrice=" + originalPrice +
                ", originalPriceUnit='" + originalPriceUnit + '\'' +
                ", costPrice=" + costPrice +
                ", costPriceUnit='" + costPriceUnit + '\'' +
                ", sellPrice=" + sellPrice +
                ", sellUnit='" + sellUnit + '\'' +
                ", minUnitPrice=" + minUnitPrice +
                ", minUnitName='" + minUnitName + '\'' +
                ", reduceProductPrice=" + reduceProductPrice +
                ", reduceProductPriceUnit='" + reduceProductPriceUnit + '\'' +
                ", sellToMinUnitQuantity=" + sellToMinUnitQuantity +
                ", maxToMinUnitQuantity=" + maxToMinUnitQuantity +
                ", wineScore=" + wineScore +
                ", defaultSpecPrice=" + defaultSpecPrice +
                ", selfPickUpReducePrice=" + selfPickUpReducePrice +
                ", lastModifyTime=" + lastModifyTime +
                '}';
    }
}