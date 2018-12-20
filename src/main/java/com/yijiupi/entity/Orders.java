package com.yijiupi.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Long id;

    private Integer cityId;

    private String orderno;

    private String verison;

    private Byte ordertype;

    private Byte orderclassify;

    private Short state;

    private Short stateuser;

    private BigDecimal givecouponamount;

    private String sysremark;

    private String remarkuser;

    private String usercancelreason;

    private String remarkservice;

    private Byte paytype;

    private BigDecimal givewinescore;

    private BigDecimal costwinescore;

    private BigDecimal orderamount;

    private BigDecimal payableamount;

    private BigDecimal reduceamount;

    private BigDecimal usecouponamount;

    private BigDecimal givebonusamount;

    private BigDecimal usebonusamount;

    private BigDecimal productreduceamount;

    private Byte haspayment;

    private String contact;

    private Integer addressId;

    private String province;

    private String city;

    private String county;

    private String street;

    private String detailaddress;

    private String phone;

    private String zipcode;

    private Byte istestorder;

    private Integer userid;

    private Integer salesmanid;

    private Integer orderreducationruleId;

    private Long qrcodefileid;

    private Byte deliverymode;

    private Date createtime;

    private Integer createuserid;

    private Date lastupdatetime;

    private Integer lastupdateuserid;

    private Date ordercreatetime;

    private Date orderaudittime;

    private Date orderprinttime;

    private Date orderdelivertime;

    private Date ordercanceltime;

    private Date ordercompletetime;

    private Date ordersynctime;

    private Integer paymentstate;

    private Date orderconfirmtime;

    private Long orderbatchId;

    private BigDecimal exactpayamount;

    private String username;

    private String usermobileno;

    private String usercompanyname;

    private BigDecimal selfpickupreduceamount;

    private Integer orderattachedgiftruleId;

    private Long shopId;

    private Integer pickupWarehouseId;

    private BigDecimal useawardbonusamount;

    private BigDecimal userewardbonusamount;

    private BigDecimal usecouponcodeamount;

    private Date lastmodifytime;

    private Integer orderitemcount;

    private Integer salesmandeptid;

    private Integer onlinesalesmanid;

    private Integer onlinesalesmandeptid;

    private Long areaId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getVerison() {
        return verison;
    }

    public void setVerison(String verison) {
        this.verison = verison == null ? null : verison.trim();
    }

    public Byte getOrdertype() {
        return ordertype;
    }

    public void setOrdertype(Byte ordertype) {
        this.ordertype = ordertype;
    }

    public Byte getOrderclassify() {
        return orderclassify;
    }

    public void setOrderclassify(Byte orderclassify) {
        this.orderclassify = orderclassify;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getStateuser() {
        return stateuser;
    }

    public void setStateuser(Short stateuser) {
        this.stateuser = stateuser;
    }

    public BigDecimal getGivecouponamount() {
        return givecouponamount;
    }

    public void setGivecouponamount(BigDecimal givecouponamount) {
        this.givecouponamount = givecouponamount;
    }

    public String getSysremark() {
        return sysremark;
    }

    public void setSysremark(String sysremark) {
        this.sysremark = sysremark == null ? null : sysremark.trim();
    }

    public String getRemarkuser() {
        return remarkuser;
    }

    public void setRemarkuser(String remarkuser) {
        this.remarkuser = remarkuser == null ? null : remarkuser.trim();
    }

    public String getUsercancelreason() {
        return usercancelreason;
    }

    public void setUsercancelreason(String usercancelreason) {
        this.usercancelreason = usercancelreason == null ? null : usercancelreason.trim();
    }

    public String getRemarkservice() {
        return remarkservice;
    }

    public void setRemarkservice(String remarkservice) {
        this.remarkservice = remarkservice == null ? null : remarkservice.trim();
    }

    public Byte getPaytype() {
        return paytype;
    }

    public void setPaytype(Byte paytype) {
        this.paytype = paytype;
    }

    public BigDecimal getGivewinescore() {
        return givewinescore;
    }

    public void setGivewinescore(BigDecimal givewinescore) {
        this.givewinescore = givewinescore;
    }

    public BigDecimal getCostwinescore() {
        return costwinescore;
    }

    public void setCostwinescore(BigDecimal costwinescore) {
        this.costwinescore = costwinescore;
    }

    public BigDecimal getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(BigDecimal orderamount) {
        this.orderamount = orderamount;
    }

    public BigDecimal getPayableamount() {
        return payableamount;
    }

    public void setPayableamount(BigDecimal payableamount) {
        this.payableamount = payableamount;
    }

    public BigDecimal getReduceamount() {
        return reduceamount;
    }

    public void setReduceamount(BigDecimal reduceamount) {
        this.reduceamount = reduceamount;
    }

    public BigDecimal getUsecouponamount() {
        return usecouponamount;
    }

    public void setUsecouponamount(BigDecimal usecouponamount) {
        this.usecouponamount = usecouponamount;
    }

    public BigDecimal getGivebonusamount() {
        return givebonusamount;
    }

    public void setGivebonusamount(BigDecimal givebonusamount) {
        this.givebonusamount = givebonusamount;
    }

    public BigDecimal getUsebonusamount() {
        return usebonusamount;
    }

    public void setUsebonusamount(BigDecimal usebonusamount) {
        this.usebonusamount = usebonusamount;
    }

    public BigDecimal getProductreduceamount() {
        return productreduceamount;
    }

    public void setProductreduceamount(BigDecimal productreduceamount) {
        this.productreduceamount = productreduceamount;
    }

    public Byte getHaspayment() {
        return haspayment;
    }

    public void setHaspayment(Byte haspayment) {
        this.haspayment = haspayment;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getDetailaddress() {
        return detailaddress;
    }

    public void setDetailaddress(String detailaddress) {
        this.detailaddress = detailaddress == null ? null : detailaddress.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode == null ? null : zipcode.trim();
    }

    public Byte getIstestorder() {
        return istestorder;
    }

    public void setIstestorder(Byte istestorder) {
        this.istestorder = istestorder;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSalesmanid() {
        return salesmanid;
    }

    public void setSalesmanid(Integer salesmanid) {
        this.salesmanid = salesmanid;
    }

    public Integer getOrderreducationruleId() {
        return orderreducationruleId;
    }

    public void setOrderreducationruleId(Integer orderreducationruleId) {
        this.orderreducationruleId = orderreducationruleId;
    }

    public Long getQrcodefileid() {
        return qrcodefileid;
    }

    public void setQrcodefileid(Long qrcodefileid) {
        this.qrcodefileid = qrcodefileid;
    }

    public Byte getDeliverymode() {
        return deliverymode;
    }

    public void setDeliverymode(Byte deliverymode) {
        this.deliverymode = deliverymode;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(Integer createuserid) {
        this.createuserid = createuserid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getLastupdateuserid() {
        return lastupdateuserid;
    }

    public void setLastupdateuserid(Integer lastupdateuserid) {
        this.lastupdateuserid = lastupdateuserid;
    }

    public Date getOrdercreatetime() {
        return ordercreatetime;
    }

    public void setOrdercreatetime(Date ordercreatetime) {
        this.ordercreatetime = ordercreatetime;
    }

    public Date getOrderaudittime() {
        return orderaudittime;
    }

    public void setOrderaudittime(Date orderaudittime) {
        this.orderaudittime = orderaudittime;
    }

    public Date getOrderprinttime() {
        return orderprinttime;
    }

    public void setOrderprinttime(Date orderprinttime) {
        this.orderprinttime = orderprinttime;
    }

    public Date getOrderdelivertime() {
        return orderdelivertime;
    }

    public void setOrderdelivertime(Date orderdelivertime) {
        this.orderdelivertime = orderdelivertime;
    }

    public Date getOrdercanceltime() {
        return ordercanceltime;
    }

    public void setOrdercanceltime(Date ordercanceltime) {
        this.ordercanceltime = ordercanceltime;
    }

    public Date getOrdercompletetime() {
        return ordercompletetime;
    }

    public void setOrdercompletetime(Date ordercompletetime) {
        this.ordercompletetime = ordercompletetime;
    }

    public Date getOrdersynctime() {
        return ordersynctime;
    }

    public void setOrdersynctime(Date ordersynctime) {
        this.ordersynctime = ordersynctime;
    }

    public Integer getPaymentstate() {
        return paymentstate;
    }

    public void setPaymentstate(Integer paymentstate) {
        this.paymentstate = paymentstate;
    }

    public Date getOrderconfirmtime() {
        return orderconfirmtime;
    }

    public void setOrderconfirmtime(Date orderconfirmtime) {
        this.orderconfirmtime = orderconfirmtime;
    }

    public Long getOrderbatchId() {
        return orderbatchId;
    }

    public void setOrderbatchId(Long orderbatchId) {
        this.orderbatchId = orderbatchId;
    }

    public BigDecimal getExactpayamount() {
        return exactpayamount;
    }

    public void setExactpayamount(BigDecimal exactpayamount) {
        this.exactpayamount = exactpayamount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUsermobileno() {
        return usermobileno;
    }

    public void setUsermobileno(String usermobileno) {
        this.usermobileno = usermobileno == null ? null : usermobileno.trim();
    }

    public String getUsercompanyname() {
        return usercompanyname;
    }

    public void setUsercompanyname(String usercompanyname) {
        this.usercompanyname = usercompanyname == null ? null : usercompanyname.trim();
    }

    public BigDecimal getSelfpickupreduceamount() {
        return selfpickupreduceamount;
    }

    public void setSelfpickupreduceamount(BigDecimal selfpickupreduceamount) {
        this.selfpickupreduceamount = selfpickupreduceamount;
    }

    public Integer getOrderattachedgiftruleId() {
        return orderattachedgiftruleId;
    }

    public void setOrderattachedgiftruleId(Integer orderattachedgiftruleId) {
        this.orderattachedgiftruleId = orderattachedgiftruleId;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public Integer getPickupWarehouseId() {
        return pickupWarehouseId;
    }

    public void setPickupWarehouseId(Integer pickupWarehouseId) {
        this.pickupWarehouseId = pickupWarehouseId;
    }

    public BigDecimal getUseawardbonusamount() {
        return useawardbonusamount;
    }

    public void setUseawardbonusamount(BigDecimal useawardbonusamount) {
        this.useawardbonusamount = useawardbonusamount;
    }

    public BigDecimal getUserewardbonusamount() {
        return userewardbonusamount;
    }

    public void setUserewardbonusamount(BigDecimal userewardbonusamount) {
        this.userewardbonusamount = userewardbonusamount;
    }

    public BigDecimal getUsecouponcodeamount() {
        return usecouponcodeamount;
    }

    public void setUsecouponcodeamount(BigDecimal usecouponcodeamount) {
        this.usecouponcodeamount = usecouponcodeamount;
    }

    public Date getLastmodifytime() {
        return lastmodifytime;
    }

    public void setLastmodifytime(Date lastmodifytime) {
        this.lastmodifytime = lastmodifytime;
    }

    public Integer getOrderitemcount() {
        return orderitemcount;
    }

    public void setOrderitemcount(Integer orderitemcount) {
        this.orderitemcount = orderitemcount;
    }

    public Integer getSalesmandeptid() {
        return salesmandeptid;
    }

    public void setSalesmandeptid(Integer salesmandeptid) {
        this.salesmandeptid = salesmandeptid;
    }

    public Integer getOnlinesalesmanid() {
        return onlinesalesmanid;
    }

    public void setOnlinesalesmanid(Integer onlinesalesmanid) {
        this.onlinesalesmanid = onlinesalesmanid;
    }

    public Integer getOnlinesalesmandeptid() {
        return onlinesalesmandeptid;
    }

    public void setOnlinesalesmandeptid(Integer onlinesalesmandeptid) {
        this.onlinesalesmandeptid = onlinesalesmandeptid;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }
}