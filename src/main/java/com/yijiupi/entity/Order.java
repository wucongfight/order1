package com.yijiupi.entity;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private String idNumber;

    private Long id;

    private Integer cityId;

    private String orderNo;

    private String verison;

    private Byte orderType;

    private Byte orderClassify;

    private Short state;

    private Short stateUser;

    private BigDecimal giveCoupOnAmount;

    private String sysRemark;

    private String remarkUser;

    private String userCancelReason;

    private String remarkService;

    private Byte payType;

    private BigDecimal giveWineScore;

    private BigDecimal costWineScore;

    private BigDecimal orderAmount;

    private BigDecimal payAbleAmount;

    private BigDecimal reduceAmount;

    private BigDecimal useCoupOnAmount;

    private BigDecimal giveBonusAmount;

    private BigDecimal useBonusAmount;

    private BigDecimal productReduceAmount;

    private Byte hasPayment;

    private String contact;

    private Integer addressId;

    private String province;

    private String city;

    private String county;

    private String street;

    private String detailAddress;

    private String phone;

    private String zipCode;

    private Byte isTestOrder;

    private Integer userId;

    private Integer salesManId;

    private Integer orderReductionRuleId;

    private Long qrCodeFileId;

    private Byte deliveryMode;

    private Date createTime;

    private Integer createUserId;

    private Date lastUpDateTime;

    private Integer lastUpDateUserId;

    private Date orderCreateTime;

    private Date orderAuditTime;

    private Date orderPrintTime;

    private Date orderDeliverTime;

    private Date orderCancelTime;

    private Date orderCompleteTime;

    private Date orderSyncTime;

    private Integer paymentState;

    private Date orderConfirmTime;

    private Long orderBatchId;

    private BigDecimal exactPayAmount;

    private String userName;

    private String userMobileNo;

    private String userCompanyName;

    private BigDecimal selfPickUpReduceAmount;

    private Integer orderAttachedGiftRuleId;

    private Long shopId;

    private Integer pickupWarehouseId;

    private BigDecimal useAwardBonusAmount;

    private BigDecimal userEwardBonusAmount;

    private BigDecimal useCouponCodeAmount;

    private Date lastModifyTime;

    private Integer orderItemCount;

    private Integer salesManDeptId;

    private Integer onLineSalesManId;

    private Integer onlineSalesManDeptId;

    private Long areaId;

    public String getIdNumber() {
        return this.id.toString();
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setVerison(String verison) {
        this.verison = verison;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public void setOrderClassify(Byte orderClassify) {
        this.orderClassify = orderClassify;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public void setStateUser(Short stateUser) {
        this.stateUser = stateUser;
    }

    public void setGiveCoupOnAmount(BigDecimal giveCoupOnAmount) {
        this.giveCoupOnAmount = giveCoupOnAmount;
    }

    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
    }

    public void setRemarkUser(String remarkUser) {
        this.remarkUser = remarkUser;
    }

    public void setUserCancelReason(String userCancelReason) {
        this.userCancelReason = userCancelReason;
    }

    public void setRemarkService(String remarkService) {
        this.remarkService = remarkService;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public void setGiveWineScore(BigDecimal giveWineScore) {
        this.giveWineScore = giveWineScore;
    }

    public void setCostWineScore(BigDecimal costWineScore) {
        this.costWineScore = costWineScore;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setPayAbleAmount(BigDecimal payAbleAmount) {
        this.payAbleAmount = payAbleAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public void setUseCoupOnAmount(BigDecimal useCoupOnAmount) {
        this.useCoupOnAmount = useCoupOnAmount;
    }

    public void setGiveBonusAmount(BigDecimal giveBonusAmount) {
        this.giveBonusAmount = giveBonusAmount;
    }

    public void setUseBonusAmount(BigDecimal useBonusAmount) {
        this.useBonusAmount = useBonusAmount;
    }

    public void setProductReduceAmount(BigDecimal productReduceAmount) {
        this.productReduceAmount = productReduceAmount;
    }

    public void setHasPayment(Byte hasPayment) {
        this.hasPayment = hasPayment;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setIsTestOrder(Byte isTestOrder) {
        this.isTestOrder = isTestOrder;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setSalesManId(Integer salesManId) {
        this.salesManId = salesManId;
    }

    public void setOrderReductionRuleId(Integer orderReductionRuleId) {
        this.orderReductionRuleId = orderReductionRuleId;
    }

    public void setQrCodeFileId(Long qrCodeFileId) {
        this.qrCodeFileId = qrCodeFileId;
    }

    public void setDeliveryMode(Byte deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public void setLastUpDateTime(Date lastUpDateTime) {
        this.lastUpDateTime = lastUpDateTime;
    }

    public void setLastUpDateUserId(Integer lastUpDateUserId) {
        this.lastUpDateUserId = lastUpDateUserId;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public void setOrderAuditTime(Date orderAuditTime) {
        this.orderAuditTime = orderAuditTime;
    }

    public void setOrderPrintTime(Date orderPrintTime) {
        this.orderPrintTime = orderPrintTime;
    }

    public void setOrderDeliverTime(Date orderDeliverTime) {
        this.orderDeliverTime = orderDeliverTime;
    }

    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    public void setOrderCompleteTime(Date orderCompleteTime) {
        this.orderCompleteTime = orderCompleteTime;
    }

    public void setOrderSyncTime(Date orderSyncTime) {
        this.orderSyncTime = orderSyncTime;
    }

    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    public void setOrderConfirmTime(Date orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }

    public void setOrderBatchId(Long orderBatchId) {
        this.orderBatchId = orderBatchId;
    }

    public void setExactPayAmount(BigDecimal exactPayAmount) {
        this.exactPayAmount = exactPayAmount;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    public void setUserCompanyName(String userCompanyName) {
        this.userCompanyName = userCompanyName;
    }

    public void setSelfPickUpReduceAmount(BigDecimal selfPickUpReduceAmount) {
        this.selfPickUpReduceAmount = selfPickUpReduceAmount;
    }

    public void setOrderAttachedGiftRuleId(Integer orderAttachedGiftRuleId) {
        this.orderAttachedGiftRuleId = orderAttachedGiftRuleId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setPickupWarehouseId(Integer pickupWarehouseId) {
        this.pickupWarehouseId = pickupWarehouseId;
    }

    public void setUseAwardBonusAmount(BigDecimal useAwardBonusAmount) {
        this.useAwardBonusAmount = useAwardBonusAmount;
    }

    public void setUserEwardBonusAmount(BigDecimal userEwardBonusAmount) {
        this.userEwardBonusAmount = userEwardBonusAmount;
    }

    public void setUseCouponCodeAmount(BigDecimal useCouponCodeAmount) {
        this.useCouponCodeAmount = useCouponCodeAmount;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public void setOrderItemCount(Integer orderItemCount) {
        this.orderItemCount = orderItemCount;
    }

    public void setSalesManDeptId(Integer salesManDeptId) {
        this.salesManDeptId = salesManDeptId;
    }

    public void setOnLineSalesManId(Integer onLineSalesManId) {
        this.onLineSalesManId = onLineSalesManId;
    }

    public void setOnlineSalesManDeptId(Integer onlineSalesManDeptId) {
        this.onlineSalesManDeptId = onlineSalesManDeptId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getId() {
        return id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public String getVerison() {
        return verison;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public Byte getOrderClassify() {
        return orderClassify;
    }

    public Short getState() {
        return state;
    }

    public Short getStateUser() {
        return stateUser;
    }

    public BigDecimal getGiveCoupOnAmount() {
        return giveCoupOnAmount;
    }

    public String getSysRemark() {
        return sysRemark;
    }

    public String getRemarkUser() {
        return remarkUser;
    }

    public String getUserCancelReason() {
        return userCancelReason;
    }

    public String getRemarkService() {
        return remarkService;
    }

    public Byte getPayType() {
        return payType;
    }

    public BigDecimal getGiveWineScore() {
        return giveWineScore;
    }

    public BigDecimal getCostWineScore() {
        return costWineScore;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public BigDecimal getPayAbleAmount() {
        return payAbleAmount;
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public BigDecimal getUseCoupOnAmount() {
        return useCoupOnAmount;
    }

    public BigDecimal getGiveBonusAmount() {
        return giveBonusAmount;
    }

    public BigDecimal getUseBonusAmount() {
        return useBonusAmount;
    }

    public BigDecimal getProductReduceAmount() {
        return productReduceAmount;
    }

    public Byte getHasPayment() {
        return hasPayment;
    }

    public String getContact() {
        return contact;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getStreet() {
        return street;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Byte getIsTestOrder() {
        return isTestOrder;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getSalesManId() {
        return salesManId;
    }

    public Integer getOrderReductionRuleId() {
        return orderReductionRuleId;
    }

    public Long getQrCodeFileId() {
        return qrCodeFileId;
    }

    public Byte getDeliveryMode() {
        return deliveryMode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public Date getLastUpDateTime() {
        return lastUpDateTime;
    }

    public Integer getLastUpDateUserId() {
        return lastUpDateUserId;
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public Date getOrderAuditTime() {
        return orderAuditTime;
    }

    public Date getOrderPrintTime() {
        return orderPrintTime;
    }

    public Date getOrderDeliverTime() {
        return orderDeliverTime;
    }

    public Date getOrderCancelTime() {
        return orderCancelTime;
    }

    public Date getOrderCompleteTime() {
        return orderCompleteTime;
    }

    public Date getOrderSyncTime() {
        return orderSyncTime;
    }

    public Integer getPaymentState() {
        return paymentState;
    }

    public Date getOrderConfirmTime() {
        return orderConfirmTime;
    }

    public Long getOrderBatchId() {
        return orderBatchId;
    }

    public BigDecimal getExactPayAmount() {
        return exactPayAmount;
    }

    public String getuserName() {
        return userName;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public String getUserCompanyName() {
        return userCompanyName;
    }

    public BigDecimal getSelfPickUpReduceAmount() {
        return selfPickUpReduceAmount;
    }

    public Integer getOrderAttachedGiftRuleId() {
        return orderAttachedGiftRuleId;
    }

    public Long getShopId() {
        return shopId;
    }

    public Integer getPickupWarehouseId() {
        return pickupWarehouseId;
    }

    public BigDecimal getUseAwardBonusAmount() {
        return useAwardBonusAmount;
    }

    public BigDecimal getUserEwardBonusAmount() {
        return userEwardBonusAmount;
    }

    public BigDecimal getUseCouponCodeAmount() {
        return useCouponCodeAmount;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public Integer getOrderItemCount() {
        return orderItemCount;
    }

    public Integer getSalesManDeptId() {
        return salesManDeptId;
    }

    public Integer getOnLineSalesManId() {
        return onLineSalesManId;
    }

    public Integer getOnlineSalesManDeptId() {
        return onlineSalesManDeptId;
    }

    public Long getAreaId() {
        return areaId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idNumber='" + idNumber + '\'' +
                ", id=" + id +
                ", cityId=" + cityId +
                ", orderNo='" + orderNo + '\'' +
                ", verison='" + verison + '\'' +
                ", orderType=" + orderType +
                ", orderClassify=" + orderClassify +
                ", state=" + state +
                ", stateUser=" + stateUser +
                ", giveCoupOnAmount=" + giveCoupOnAmount +
                ", sysRemark='" + sysRemark + '\'' +
                ", remarkUser='" + remarkUser + '\'' +
                ", userCancelReason='" + userCancelReason + '\'' +
                ", remarkService='" + remarkService + '\'' +
                ", payType=" + payType +
                ", giveWineScore=" + giveWineScore +
                ", costWineScore=" + costWineScore +
                ", orderAmount=" + orderAmount +
                ", payAbleAmount=" + payAbleAmount +
                ", reduceAmount=" + reduceAmount +
                ", useCoupOnAmount=" + useCoupOnAmount +
                ", giveBonusAmount=" + giveBonusAmount +
                ", useBonusAmount=" + useBonusAmount +
                ", productReduceAmount=" + productReduceAmount +
                ", hasPayment=" + hasPayment +
                ", contact='" + contact + '\'' +
                ", addressId=" + addressId +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", street='" + street + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                ", phone='" + phone + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", isTestOrder=" + isTestOrder +
                ", userId=" + userId +
                ", salesManId=" + salesManId +
                ", orderReductionRuleId=" + orderReductionRuleId +
                ", qrCodeFileId=" + qrCodeFileId +
                ", deliveryMode=" + deliveryMode +
                ", createTime=" + createTime +
                ", createUserId=" + createUserId +
                ", lastUpDateTime=" + lastUpDateTime +
                ", lastUpDateUserId=" + lastUpDateUserId +
                ", orderCreateTime=" + orderCreateTime +
                ", orderAuditTime=" + orderAuditTime +
                ", orderPrintTime=" + orderPrintTime +
                ", orderDeliverTime=" + orderDeliverTime +
                ", orderCancelTime=" + orderCancelTime +
                ", orderCompleteTime=" + orderCompleteTime +
                ", orderSyncTime=" + orderSyncTime +
                ", paymentState=" + paymentState +
                ", orderConfirmTime=" + orderConfirmTime +
                ", orderBatchId=" + orderBatchId +
                ", exactPayAmount=" + exactPayAmount +
                ", userName='" + userName + '\'' +
                ", userMobileNo='" + userMobileNo + '\'' +
                ", userCompanyName='" + userCompanyName + '\'' +
                ", selfPickUpReduceAmount=" + selfPickUpReduceAmount +
                ", orderAttachedGiftRuleId=" + orderAttachedGiftRuleId +
                ", shopId=" + shopId +
                ", pickupWarehouseId=" + pickupWarehouseId +
                ", useAwardBonusAmount=" + useAwardBonusAmount +
                ", userEwardBonusAmount=" + userEwardBonusAmount +
                ", useCouponCodeAmount=" + useCouponCodeAmount +
                ", lastModifyTime=" + lastModifyTime +
                ", orderItemCount=" + orderItemCount +
                ", salesManDeptId=" + salesManDeptId +
                ", onLineSalesManId=" + onLineSalesManId +
                ", onlineSalesManDeptId=" + onlineSalesManDeptId +
                ", areaId=" + areaId +
                '}';
    }
}