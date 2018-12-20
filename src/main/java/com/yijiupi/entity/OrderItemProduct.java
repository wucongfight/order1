package com.yijiupi.entity;

import java.util.Date;

public class OrderItemProduct {
    private Long id;

    private Long orderid;

    private Long productid;

    private String productversion;

    private Long productsalespecId;

    private String productname;

    private String productsalespec;

    private Integer salespecquantity;

    private String sellunit;

    private String productspec;

    private Integer specquantity;

    private String packagename;

    private String unitname;

    private Byte salemode;

    private Boolean isusebonus;

    private Boolean isusecoupon;

    private Boolean iscumulative;

    private Boolean isadditionalpurchase;

    private Integer supplierid;

    private Boolean isregionpurchaseproduct;

    private Long oldproductid;

    private Byte productbusinessclass;

    private Boolean isinordergive;

    private Boolean ishiddenproduct;

    private Date lastmodifytime;

    private Integer productinfoid;

    private Integer productspecid;

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

    public Long getProductid() {
        return productid;
    }

    public void setProductid(Long productid) {
        this.productid = productid;
    }

    public String getProductversion() {
        return productversion;
    }

    public void setProductversion(String productversion) {
        this.productversion = productversion == null ? null : productversion.trim();
    }

    public Long getProductsalespecId() {
        return productsalespecId;
    }

    public void setProductsalespecId(Long productsalespecId) {
        this.productsalespecId = productsalespecId;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname == null ? null : productname.trim();
    }

    public String getProductsalespec() {
        return productsalespec;
    }

    public void setProductsalespec(String productsalespec) {
        this.productsalespec = productsalespec == null ? null : productsalespec.trim();
    }

    public Integer getSalespecquantity() {
        return salespecquantity;
    }

    public void setSalespecquantity(Integer salespecquantity) {
        this.salespecquantity = salespecquantity;
    }

    public String getSellunit() {
        return sellunit;
    }

    public void setSellunit(String sellunit) {
        this.sellunit = sellunit == null ? null : sellunit.trim();
    }

    public String getProductspec() {
        return productspec;
    }

    public void setProductspec(String productspec) {
        this.productspec = productspec == null ? null : productspec.trim();
    }

    public Integer getSpecquantity() {
        return specquantity;
    }

    public void setSpecquantity(Integer specquantity) {
        this.specquantity = specquantity;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename == null ? null : packagename.trim();
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public Byte getSalemode() {
        return salemode;
    }

    public void setSalemode(Byte salemode) {
        this.salemode = salemode;
    }

    public Boolean getIsusebonus() {
        return isusebonus;
    }

    public void setIsusebonus(Boolean isusebonus) {
        this.isusebonus = isusebonus;
    }

    public Boolean getIsusecoupon() {
        return isusecoupon;
    }

    public void setIsusecoupon(Boolean isusecoupon) {
        this.isusecoupon = isusecoupon;
    }

    public Boolean getIscumulative() {
        return iscumulative;
    }

    public void setIscumulative(Boolean iscumulative) {
        this.iscumulative = iscumulative;
    }

    public Boolean getIsadditionalpurchase() {
        return isadditionalpurchase;
    }

    public void setIsadditionalpurchase(Boolean isadditionalpurchase) {
        this.isadditionalpurchase = isadditionalpurchase;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Boolean getIsregionpurchaseproduct() {
        return isregionpurchaseproduct;
    }

    public void setIsregionpurchaseproduct(Boolean isregionpurchaseproduct) {
        this.isregionpurchaseproduct = isregionpurchaseproduct;
    }

    public Long getOldproductid() {
        return oldproductid;
    }

    public void setOldproductid(Long oldproductid) {
        this.oldproductid = oldproductid;
    }

    public Byte getProductbusinessclass() {
        return productbusinessclass;
    }

    public void setProductbusinessclass(Byte productbusinessclass) {
        this.productbusinessclass = productbusinessclass;
    }

    public Boolean getIsinordergive() {
        return isinordergive;
    }

    public void setIsinordergive(Boolean isinordergive) {
        this.isinordergive = isinordergive;
    }

    public Boolean getIshiddenproduct() {
        return ishiddenproduct;
    }

    public void setIshiddenproduct(Boolean ishiddenproduct) {
        this.ishiddenproduct = ishiddenproduct;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public Integer getProductinfoid() {
        return productinfoid;
    }

    public void setProductinfoid(Integer productinfoid) {
        this.productinfoid = productinfoid;
    }

    public Integer getProductspecid() {
        return productspecid;
    }

    public void setProductspecid(Integer productspecid) {
        this.productspecid = productspecid;
    }
}