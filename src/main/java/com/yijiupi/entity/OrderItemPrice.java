package com.yijiupi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderItemPrice {
    private Long id;

    private Long orderid;

    private BigDecimal originalprice;

    private String originalpriceunit;

    private BigDecimal costprice;

    private String costpriceunit;

    private BigDecimal sellprice;

    private String sellunit;

    private BigDecimal minunitprice;

    private String minunitname;

    private BigDecimal reduceproductprice;

    private String reduceproductpriceunit;

    private Integer selltominunitquantity;

    private Integer maxtominunitquantity;

    private Integer winescore;

    private BigDecimal defaultspecprice;

    private BigDecimal selfpickupreduceprice;

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

    public BigDecimal getOriginalprice() {
        return originalprice;
    }

    public void setOriginalprice(BigDecimal originalprice) {
        this.originalprice = originalprice;
    }

    public String getOriginalpriceunit() {
        return originalpriceunit;
    }

    public void setOriginalpriceunit(String originalpriceunit) {
        this.originalpriceunit = originalpriceunit == null ? null : originalpriceunit.trim();
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public String getCostpriceunit() {
        return costpriceunit;
    }

    public void setCostpriceunit(String costpriceunit) {
        this.costpriceunit = costpriceunit == null ? null : costpriceunit.trim();
    }

    public BigDecimal getSellprice() {
        return sellprice;
    }

    public void setSellprice(BigDecimal sellprice) {
        this.sellprice = sellprice;
    }

    public String getSellunit() {
        return sellunit;
    }

    public void setSellunit(String sellunit) {
        this.sellunit = sellunit == null ? null : sellunit.trim();
    }

    public BigDecimal getMinunitprice() {
        return minunitprice;
    }

    public void setMinunitprice(BigDecimal minunitprice) {
        this.minunitprice = minunitprice;
    }

    public String getMinunitname() {
        return minunitname;
    }

    public void setMinunitname(String minunitname) {
        this.minunitname = minunitname == null ? null : minunitname.trim();
    }

    public BigDecimal getReduceproductprice() {
        return reduceproductprice;
    }

    public void setReduceproductprice(BigDecimal reduceproductprice) {
        this.reduceproductprice = reduceproductprice;
    }

    public String getReduceproductpriceunit() {
        return reduceproductpriceunit;
    }

    public void setReduceproductpriceunit(String reduceproductpriceunit) {
        this.reduceproductpriceunit = reduceproductpriceunit == null ? null : reduceproductpriceunit.trim();
    }

    public Integer getSelltominunitquantity() {
        return selltominunitquantity;
    }

    public void setSelltominunitquantity(Integer selltominunitquantity) {
        this.selltominunitquantity = selltominunitquantity;
    }

    public Integer getMaxtominunitquantity() {
        return maxtominunitquantity;
    }

    public void setMaxtominunitquantity(Integer maxtominunitquantity) {
        this.maxtominunitquantity = maxtominunitquantity;
    }

    public Integer getWinescore() {
        return winescore;
    }

    public void setWinescore(Integer winescore) {
        this.winescore = winescore;
    }

    public BigDecimal getDefaultspecprice() {
        return defaultspecprice;
    }

    public void setDefaultspecprice(BigDecimal defaultspecprice) {
        this.defaultspecprice = defaultspecprice;
    }

    public BigDecimal getSelfpickupreduceprice() {
        return selfpickupreduceprice;
    }

    public void setSelfpickupreduceprice(BigDecimal selfpickupreduceprice) {
        this.selfpickupreduceprice = selfpickupreduceprice;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    @Override
    public String toString() {
        return "OrderItemPrice{" +
                "id=" + id +
                ", orderid=" + orderid +
                ", originalprice=" + originalprice +
                ", originalpriceunit='" + originalpriceunit + '\'' +
                ", costprice=" + costprice +
                ", costpriceunit='" + costpriceunit + '\'' +
                ", sellprice=" + sellprice +
                ", sellunit='" + sellunit + '\'' +
                ", minunitprice=" + minunitprice +
                ", minunitname='" + minunitname + '\'' +
                ", reduceproductprice=" + reduceproductprice +
                ", reduceproductpriceunit='" + reduceproductpriceunit + '\'' +
                ", selltominunitquantity=" + selltominunitquantity +
                ", maxtominunitquantity=" + maxtominunitquantity +
                ", winescore=" + winescore +
                ", defaultspecprice=" + defaultspecprice +
                ", selfpickupreduceprice=" + selfpickupreduceprice +
                ", lastmodifytime=" + lastmodifytime +
                '}';
    }
}