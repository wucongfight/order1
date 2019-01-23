package com.yijiupi.entity;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */

import java.math.BigDecimal;
import java.util.Date;

public class Order {

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




    /**
     * 获取 主键。
     *
     * @return id 主键。
     */
    public Long getId() {
        return this.id;
    }

    /**
     * 设置 主键。
     *
     * @param id 主键。
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取
     *
     * @return cityId
     */
    public Integer getCityId() {
        return this.cityId;
    }

    /**
     * 设置
     *
     * @param cityId
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * 获取
     *
     * @return orderNo
     */
    public String getOrderNo() {
        return this.orderNo;
    }

    /**
     * 设置
     *
     * @param orderNo
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    /**
     * 获取
     *
     * @return verison
     */
    public String getVerison() {
        return this.verison;
    }

    /**
     * 设置
     *
     * @param verison
     */
    public void setVerison(String verison) {
        this.verison = verison;
    }

    /**
     * 获取
     *
     * @return orderType
     */
    public Byte getOrderType() {
        return this.orderType;
    }

    /**
     * 设置
     *
     * @param orderType
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取
     *
     * @return orderClassify
     */
    public Byte getOrderClassify() {
        return this.orderClassify;
    }

    /**
     * 设置
     *
     * @param orderClassify
     */
    public void setOrderClassify(Byte orderClassify) {
        this.orderClassify = orderClassify;
    }

    /**
     * 获取
     *
     * @return state
     */
    public Short getState() {
        return this.state;
    }

    /**
     * 设置
     *
     * @param state
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * 获取
     *
     * @return stateUser
     */
    public Short getStateUser() {
        return this.stateUser;
    }

    /**
     * 设置
     *
     * @param stateUser
     */
    public void setStateUser(Short stateUser) {
        this.stateUser = stateUser;
    }

    /**
     * 获取
     *
     * @return giveCoupOnAmount
     */
    public BigDecimal getGiveCoupOnAmount() {
        return this.giveCoupOnAmount;
    }

    /**
     * 设置
     *
     * @param giveCoupOnAmount
     */
    public void setGiveCoupOnAmount(BigDecimal giveCoupOnAmount) {
        this.giveCoupOnAmount = giveCoupOnAmount;
    }

    /**
     * 获取
     *
     * @return sysRemark
     */
    public String getSysRemark() {
        return this.sysRemark;
    }

    /**
     * 设置
     *
     * @param sysRemark
     */
    public void setSysRemark(String sysRemark) {
        this.sysRemark = sysRemark;
    }

    /**
     * 获取
     *
     * @return remarkUser
     */
    public String getRemarkUser() {
        return this.remarkUser;
    }

    /**
     * 设置
     *
     * @param remarkUser
     */
    public void setRemarkUser(String remarkUser) {
        this.remarkUser = remarkUser;
    }

    /**
     * 获取
     *
     * @return userCancelReason
     */
    public String getUserCancelReason() {
        return this.userCancelReason;
    }

    /**
     * 设置
     *
     * @param userCancelReason
     */
    public void setUserCancelReason(String userCancelReason) {
        this.userCancelReason = userCancelReason;
    }

    /**
     * 获取
     *
     * @return remarkService
     */
    public String getRemarkService() {
        return this.remarkService;
    }

    /**
     * 设置
     *
     * @param remarkService
     */
    public void setRemarkService(String remarkService) {
        this.remarkService = remarkService;
    }

    /**
     * 获取
     *
     * @return payType
     */
    public Byte getPayType() {
        return this.payType;
    }

    /**
     * 设置
     *
     * @param payType
     */
    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    /**
     * 获取
     *
     * @return giveWineScore
     */
    public BigDecimal getGiveWineScore() {
        return this.giveWineScore;
    }

    /**
     * 设置
     *
     * @param giveWineScore
     */
    public void setGiveWineScore(BigDecimal giveWineScore) {
        this.giveWineScore = giveWineScore;
    }

    /**
     * 获取
     *
     * @return costWineScore
     */
    public BigDecimal getCostWineScore() {
        return this.costWineScore;
    }

    /**
     * 设置
     *
     * @param costWineScore
     */
    public void setCostWineScore(BigDecimal costWineScore) {
        this.costWineScore = costWineScore;
    }

    /**
     * 获取
     *
     * @return orderAmount
     */
    public BigDecimal getOrderAmount() {
        return this.orderAmount;
    }

    /**
     * 设置
     *
     * @param orderAmount
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * 获取
     *
     * @return payAbleAmount
     */
    public BigDecimal getPayAbleAmount() {
        return this.payAbleAmount;
    }

    /**
     * 设置
     *
     * @param payAbleAmount
     */
    public void setPayAbleAmount(BigDecimal payAbleAmount) {
        this.payAbleAmount = payAbleAmount;
    }

    /**
     * 获取
     *
     * @return reduceAmount
     */
    public BigDecimal getReduceAmount() {
        return this.reduceAmount;
    }

    /**
     * 设置
     *
     * @param reduceAmount
     */
    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    /**
     * 获取
     *
     * @return useCoupOnAmount
     */
    public BigDecimal getUseCoupOnAmount() {
        return this.useCoupOnAmount;
    }

    /**
     * 设置
     *
     * @param useCoupOnAmount
     */
    public void setUseCoupOnAmount(BigDecimal useCoupOnAmount) {
        this.useCoupOnAmount = useCoupOnAmount;
    }

    /**
     * 获取
     *
     * @return giveBonusAmount
     */
    public BigDecimal getGiveBonusAmount() {
        return this.giveBonusAmount;
    }

    /**
     * 设置
     *
     * @param giveBonusAmount
     */
    public void setGiveBonusAmount(BigDecimal giveBonusAmount) {
        this.giveBonusAmount = giveBonusAmount;
    }

    /**
     * 获取
     *
     * @return useBonusAmount
     */
    public BigDecimal getUseBonusAmount() {
        return this.useBonusAmount;
    }

    /**
     * 设置
     *
     * @param useBonusAmount
     */
    public void setUseBonusAmount(BigDecimal useBonusAmount) {
        this.useBonusAmount = useBonusAmount;
    }

    /**
     * 获取
     *
     * @return productReduceAmount
     */
    public BigDecimal getProductReduceAmount() {
        return this.productReduceAmount;
    }

    /**
     * 设置
     *
     * @param productReduceAmount
     */
    public void setProductReduceAmount(BigDecimal productReduceAmount) {
        this.productReduceAmount = productReduceAmount;
    }

    /**
     * 获取
     *
     * @return hasPayment
     */
    public Byte getHasPayment() {
        return this.hasPayment;
    }

    /**
     * 设置
     *
     * @param hasPayment
     */
    public void setHasPayment(Byte hasPayment) {
        this.hasPayment = hasPayment;
    }

    /**
     * 获取
     *
     * @return contact
     */
    public String getContact() {
        return this.contact;
    }

    /**
     * 设置
     *
     * @param contact
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 获取
     *
     * @return addressId
     */
    public Integer getAddressId() {
        return this.addressId;
    }

    /**
     * 设置
     *
     * @param addressId
     */
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    /**
     * 获取
     *
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * 设置
     *
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取
     *
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * 设置
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     *
     * @return county
     */
    public String getCounty() {
        return this.county;
    }

    /**
     * 设置
     *
     * @param county
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * 获取
     *
     * @return street
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * 设置
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * 获取
     *
     * @return detailAddress
     */
    public String getDetailAddress() {
        return this.detailAddress;
    }

    /**
     * 设置
     *
     * @param detailAddress
     */
    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    /**
     * 获取
     *
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * 设置
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     *
     * @return zipCode
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * 设置
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取
     *
     * @return isTestOrder
     */
    public Byte getIsTestOrder() {
        return this.isTestOrder;
    }

    /**
     * 设置
     *
     * @param isTestOrder
     */
    public void setIsTestOrder(Byte isTestOrder) {
        this.isTestOrder = isTestOrder;
    }

    /**
     * 获取
     *
     * @return userId
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * 设置
     *
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取
     *
     * @return salesManId
     */
    public Integer getSalesManId() {
        return this.salesManId;
    }

    /**
     * 设置
     *
     * @param salesManId
     */
    public void setSalesManId(Integer salesManId) {
        this.salesManId = salesManId;
    }

    /**
     * 获取
     *
     * @return orderReductionRuleId
     */
    public Integer getOrderReductionRuleId() {
        return this.orderReductionRuleId;
    }

    /**
     * 设置
     *
     * @param orderReductionRuleId
     */
    public void setOrderReductionRuleId(Integer orderReductionRuleId) {
        this.orderReductionRuleId = orderReductionRuleId;
    }

    /**
     * 获取
     *
     * @return qrCodeFileId
     */
    public Long getQrCodeFileId() {
        return this.qrCodeFileId;
    }

    /**
     * 设置
     *
     * @param qrCodeFileId
     */
    public void setQrCodeFileId(Long qrCodeFileId) {
        this.qrCodeFileId = qrCodeFileId;
    }

    /**
     * 获取
     *
     * @return deliveryMode
     */
    public Byte getDeliveryMode() {
        return this.deliveryMode;
    }

    /**
     * 设置
     *
     * @param deliveryMode
     */
    public void setDeliveryMode(Byte deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

    /**
     * 获取
     *
     * @return createTime
     */
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * 设置
     *
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取
     *
     * @return createUserId
     */
    public Integer getCreateUserId() {
        return this.createUserId;
    }

    /**
     * 设置
     *
     * @param createUserId
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取
     *
     * @return lastUpDateTime
     */
    public Date getLastUpDateTime() {
        return this.lastUpDateTime;
    }

    /**
     * 设置
     *
     * @param lastUpDateTime
     */
    public void setLastUpDateTime(Date lastUpDateTime) {
        this.lastUpDateTime = lastUpDateTime;
    }

    /**
     * 获取
     *
     * @return lastUpDateUserId
     */
    public Integer getLastUpDateUserId() {
        return this.lastUpDateUserId;
    }

    /**
     * 设置
     *
     * @param lastUpDateUserId
     */
    public void setLastUpDateUserId(Integer lastUpDateUserId) {
        this.lastUpDateUserId = lastUpDateUserId;
    }

    /**
     * 获取
     *
     * @return orderCreateTime
     */
    public Date getOrderCreateTime() {
        return this.orderCreateTime;
    }

    /**
     * 设置
     *
     * @param orderCreateTime
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * 获取
     *
     * @return orderAuditTime
     */
    public Date getOrderAuditTime() {
        return this.orderAuditTime;
    }

    /**
     * 设置
     *
     * @param orderAuditTime
     */
    public void setOrderAuditTime(Date orderAuditTime) {
        this.orderAuditTime = orderAuditTime;
    }

    /**
     * 获取
     *
     * @return orderPrintTime
     */
    public Date getOrderPrintTime() {
        return this.orderPrintTime;
    }

    /**
     * 设置
     *
     * @param orderPrintTime
     */
    public void setOrderPrintTime(Date orderPrintTime) {
        this.orderPrintTime = orderPrintTime;
    }

    /**
     * 获取
     *
     * @return orderDeliverTime
     */
    public Date getOrderDeliverTime() {
        return this.orderDeliverTime;
    }

    /**
     * 设置
     *
     * @param orderDeliverTime
     */
    public void setOrderDeliverTime(Date orderDeliverTime) {
        this.orderDeliverTime = orderDeliverTime;
    }

    /**
     * 获取
     *
     * @return orderCancelTime
     */
    public Date getOrderCancelTime() {
        return this.orderCancelTime;
    }

    /**
     * 设置
     *
     * @param orderCancelTime
     */
    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    /**
     * 获取
     *
     * @return orderCompleteTime
     */
    public Date getOrderCompleteTime() {
        return this.orderCompleteTime;
    }

    /**
     * 设置
     *
     * @param orderCompleteTime
     */
    public void setOrderCompleteTime(Date orderCompleteTime) {
        this.orderCompleteTime = orderCompleteTime;
    }

    /**
     * 获取
     *
     * @return orderSyncTime
     */
    public Date getOrderSyncTime() {
        return this.orderSyncTime;
    }

    /**
     * 设置
     *
     * @param orderSyncTime
     */
    public void setOrderSyncTime(Date orderSyncTime) {
        this.orderSyncTime = orderSyncTime;
    }

    /**
     * 获取
     *
     * @return paymentState
     */
    public Integer getPaymentState() {
        return this.paymentState;
    }

    /**
     * 设置
     *
     * @param paymentState
     */
    public void setPaymentState(Integer paymentState) {
        this.paymentState = paymentState;
    }

    /**
     * 获取
     *
     * @return orderConfirmTime
     */
    public Date getOrderConfirmTime() {
        return this.orderConfirmTime;
    }

    /**
     * 设置
     *
     * @param orderConfirmTime
     */
    public void setOrderConfirmTime(Date orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }

    /**
     * 获取
     *
     * @return orderBatchId
     */
    public Long getOrderBatchId() {
        return this.orderBatchId;
    }

    /**
     * 设置
     *
     * @param orderBatchId
     */
    public void setOrderBatchId(Long orderBatchId) {
        this.orderBatchId = orderBatchId;
    }

    /**
     * 获取
     *
     * @return exactPayAmount
     */
    public BigDecimal getExactPayAmount() {
        return this.exactPayAmount;
    }

    /**
     * 设置
     *
     * @param exactPayAmount
     */
    public void setExactPayAmount(BigDecimal exactPayAmount) {
        this.exactPayAmount = exactPayAmount;
    }

    /**
     * 获取
     *
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * 设置
     *
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取
     *
     * @return userMobileNo
     */
    public String getUserMobileNo() {
        return this.userMobileNo;
    }

    /**
     * 设置
     *
     * @param userMobileNo
     */
    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    /**
     * 获取
     *
     * @return userCompanyName
     */
    public String getUserCompanyName() {
        return this.userCompanyName;
    }

    /**
     * 设置
     *
     * @param userCompanyName
     */
    public void setUserCompanyName(String userCompanyName) {
        this.userCompanyName = userCompanyName;
    }

    /**
     * 获取
     *
     * @return selfPickUpReduceAmount
     */
    public BigDecimal getSelfPickUpReduceAmount() {
        return this.selfPickUpReduceAmount;
    }

    /**
     * 设置
     *
     * @param selfPickUpReduceAmount
     */
    public void setSelfPickUpReduceAmount(BigDecimal selfPickUpReduceAmount) {
        this.selfPickUpReduceAmount = selfPickUpReduceAmount;
    }

    /**
     * 获取
     *
     * @return orderAttachedGiftRuleId
     */
    public Integer getOrderAttachedGiftRuleId() {
        return this.orderAttachedGiftRuleId;
    }

    /**
     * 设置
     *
     * @param orderAttachedGiftRuleId
     */
    public void setOrderAttachedGiftRuleId(Integer orderAttachedGiftRuleId) {
        this.orderAttachedGiftRuleId = orderAttachedGiftRuleId;
    }

    /**
     * 获取
     *
     * @return shopId
     */
    public Long getShopId() {
        return this.shopId;
    }

    /**
     * 设置
     *
     * @param shopId
     */
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    /**
     * 获取
     *
     * @return pickupWarehouseId
     */
    public Integer getPickupWarehouseId() {
        return this.pickupWarehouseId;
    }

    /**
     * 设置
     *
     * @param pickupWarehouseId
     */
    public void setPickupWarehouseId(Integer pickupWarehouseId) {
        this.pickupWarehouseId = pickupWarehouseId;
    }

    /**
     * 获取
     *
     * @return useAwardBonusAmount
     */
    public BigDecimal getUseAwardBonusAmount() {
        return this.useAwardBonusAmount;
    }

    /**
     * 设置
     *
     * @param useAwardBonusAmount
     */
    public void setUseAwardBonusAmount(BigDecimal useAwardBonusAmount) {
        this.useAwardBonusAmount = useAwardBonusAmount;
    }

    /**
     * 获取
     *
     * @return userEwardBonusAmount
     */
    public BigDecimal getUserEwardBonusAmount() {
        return this.userEwardBonusAmount;
    }

    /**
     * 设置
     *
     * @param userEwardBonusAmount
     */
    public void setUserEwardBonusAmount(BigDecimal userEwardBonusAmount) {
        this.userEwardBonusAmount = userEwardBonusAmount;
    }

    /**
     * 获取
     *
     * @return useCouponCodeAmount
     */
    public BigDecimal getUseCouponCodeAmount() {
        return this.useCouponCodeAmount;
    }

    /**
     * 设置
     *
     * @param useCouponCodeAmount
     */
    public void setUseCouponCodeAmount(BigDecimal useCouponCodeAmount) {
        this.useCouponCodeAmount = useCouponCodeAmount;
    }

    /**
     * 获取
     *
     * @return lastModifyTime
     */
    public Date getLastModifyTime() {
        return this.lastModifyTime;
    }

    /**
     * 设置
     *
     * @param lastModifyTime
     */
    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    /**
     * 获取
     *
     * @return orderItemCount
     */
    public Integer getOrderItemCount() {
        return this.orderItemCount;
    }

    /**
     * 设置
     *
     * @param orderItemCount
     */
    public void setOrderItemCount(Integer orderItemCount) {
        this.orderItemCount = orderItemCount;
    }

    /**
     * 获取
     *
     * @return salesManDeptId
     */
    public Integer getSalesManDeptId() {
        return this.salesManDeptId;
    }

    /**
     * 设置
     *
     * @param salesManDeptId
     */
    public void setSalesManDeptId(Integer salesManDeptId) {
        this.salesManDeptId = salesManDeptId;
    }

    /**
     * 获取
     *
     * @return onLineSalesManId
     */
    public Integer getOnLineSalesManId() {
        return this.onLineSalesManId;
    }

    /**
     * 设置
     *
     * @param onLineSalesManId
     */
    public void setOnLineSalesManId(Integer onLineSalesManId) {
        this.onLineSalesManId = onLineSalesManId;
    }

    /**
     * 获取
     *
     * @return onlineSalesManDeptId
     */
    public Integer getOnlineSalesManDeptId() {
        return this.onlineSalesManDeptId;
    }

    /**
     * 设置
     *
     * @param onlineSalesManDeptId
     */
    public void setOnlineSalesManDeptId(Integer onlineSalesManDeptId) {
        this.onlineSalesManDeptId = onlineSalesManDeptId;
    }

    /**
     * 获取
     *
     * @return areaId
     */
    public Long getAreaId() {
        return this.areaId;
    }

    /**
     * 设置
     *
     * @param areaId
     */
    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
}