package com.yijiupi.entity;

import java.util.Date;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class OrderItemProduct {
    private Long id;

    private Long orderId;

    private Long productId;

    private String productVersion;

    private Long productSaleSpecId;

    private String productName;

    private String productSaleSpec;

    private Integer saleSpecQuantity;

    private String sellUnit;

    private String productSpec;

    private Integer specQuantity;

    private String packageName;

    private String unitName;

    private Byte saleMode;

    private Boolean isUseBonus;

    private Boolean isUseCoupOn;

    private Boolean isCumulative;

    private Boolean isAdditionalPurchase;

    private Integer supplierId;

    private Boolean isRegionPurchaseProduct;

    private Long oldProductId;

    private Byte productBusinessClass;

    private Boolean isInorderGive;

    private Boolean isHiddenProduct;

    private Date lastModifyTime;

    private Integer productInfoId;

    private Integer productSpecId;

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

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public Long getProductSaleSpecId() {
        return productSaleSpecId;
    }

    public void setProductSaleSpecId(Long productSaleSpecId) {
        this.productSaleSpecId = productSaleSpecId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSaleSpec() {
        return productSaleSpec;
    }

    public void setProductSaleSpec(String productSaleSpec) {
        this.productSaleSpec = productSaleSpec;
    }

    public Integer getSaleSpecQuantity() {
        return saleSpecQuantity;
    }

    public void setSaleSpecQuantity(Integer saleSpecQuantity) {
        this.saleSpecQuantity = saleSpecQuantity;
    }

    public String getSellUnit() {
        return sellUnit;
    }

    public void setSellUnit(String sellUnit) {
        this.sellUnit = sellUnit;
    }

    public String getProductSpec() {
        return productSpec;
    }

    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    public Integer getSpecQuantity() {
        return specQuantity;
    }

    public void setSpecQuantity(Integer specQuantity) {
        this.specQuantity = specQuantity;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Byte getSaleMode() {
        return saleMode;
    }

    public void setSaleMode(Byte saleMode) {
        this.saleMode = saleMode;
    }

    public Boolean getUseBonus() {
        return isUseBonus;
    }

    public void setUseBonus(Boolean useBonus) {
        isUseBonus = useBonus;
    }

    public Boolean getUseCoupOn() {
        return isUseCoupOn;
    }

    public void setUseCoupOn(Boolean useCoupOn) {
        isUseCoupOn = useCoupOn;
    }

    public Boolean getCumulative() {
        return isCumulative;
    }

    public void setCumulative(Boolean cumulative) {
        isCumulative = cumulative;
    }

    public Boolean getAdditionalPurchase() {
        return isAdditionalPurchase;
    }

    public void setAdditionalPurchase(Boolean additionalPurchase) {
        isAdditionalPurchase = additionalPurchase;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Boolean getRegionPurchaseProduct() {
        return isRegionPurchaseProduct;
    }

    public void setRegionPurchaseProduct(Boolean regionPurchaseProduct) {
        isRegionPurchaseProduct = regionPurchaseProduct;
    }

    public Long getOldProductId() {
        return oldProductId;
    }

    public void setOldProductId(Long oldProductId) {
        this.oldProductId = oldProductId;
    }

    public Byte getProductBusinessClass() {
        return productBusinessClass;
    }

    public void setProductBusinessClass(Byte productBusinessClass) {
        this.productBusinessClass = productBusinessClass;
    }

    public Boolean getInorderGive() {
        return isInorderGive;
    }

    public void setInorderGive(Boolean inorderGive) {
        isInorderGive = inorderGive;
    }

    public Boolean getHiddenProduct() {
        return isHiddenProduct;
    }

    public void setHiddenProduct(Boolean hiddenProduct) {
        isHiddenProduct = hiddenProduct;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public Integer getProductInfoId() {
        return productInfoId;
    }

    public void setProductInfoId(Integer productInfoId) {
        this.productInfoId = productInfoId;
    }

    public Integer getProductSpecId() {
        return productSpecId;
    }

    public void setProductSpecId(Integer productSpecId) {
        this.productSpecId = productSpecId;
    }

    @Override
    public String toString() {
        return "OrderItemProduct{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", productVersion='" + productVersion + '\'' +
                ", productSaleSpecId=" + productSaleSpecId +
                ", productName='" + productName + '\'' +
                ", productSaleSpec='" + productSaleSpec + '\'' +
                ", saleSpecQuantity=" + saleSpecQuantity +
                ", sellUnit='" + sellUnit + '\'' +
                ", productSpec='" + productSpec + '\'' +
                ", specQuantity=" + specQuantity +
                ", packageName='" + packageName + '\'' +
                ", unitName='" + unitName + '\'' +
                ", saleMode=" + saleMode +
                ", isUseBonus=" + isUseBonus +
                ", isUseCoupOn=" + isUseCoupOn +
                ", isCumulative=" + isCumulative +
                ", isAdditionalPurchase=" + isAdditionalPurchase +
                ", supplierId=" + supplierId +
                ", isRegionPurchaseProduct=" + isRegionPurchaseProduct +
                ", oldProductId=" + oldProductId +
                ", productBusinessClass=" + productBusinessClass +
                ", isInorderGive=" + isInorderGive +
                ", isHiddenProduct=" + isHiddenProduct +
                ", lastModifyTime=" + lastModifyTime +
                ", productInfoId=" + productInfoId +
                ", productSpecId=" + productSpecId +
                '}';
    }
}