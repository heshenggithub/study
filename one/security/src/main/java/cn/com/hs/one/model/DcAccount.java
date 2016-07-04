/* ---------------------------------------------------------------------------------------------------
 * Copyright (C) 2014-2015 fero.com.cn
 *
 * Title:        DcAccount.java
 * Description:       实体DcAccount类定义
 *
 * Dependencies:
 * 
 * History:
 *     Date                   Modifier              Log
 *     2016-05-13             fero auto             Created
 *
 * ---------------------------------------------------------------------------------------------------
 */
package cn.com.hs.one.model;

import java.io.Serializable;

import java.util.Date;

public class DcAccount implements Serializable {

    /**
     * SVU
     */
    private static final long serialVersionUID = 1L;

    /**ID*/
    private String accountId;

    /**USER_ID*/
    private String userid;

    /**真实姓名*/
    private String userName;

    /**用户名*/
    private String account;

    /**手机号*/
    private String celphone;

    /**身份证号*/
    private String idNum;

    /**邮箱*/
    private String email;

    /**地址*/
    private String address;

    /**性别*/
    private String gender;

    /**生日*/
    private Date birthday;

    /**密码*/
    private String password;

    /**秘钥*/
    private String passwordSalt;

    /**操作密码*/
    private String optPassword;

    /**操作密码秘钥*/
    private String optPasswordSalt;

    /**失败登陆次数*/
    private Integer failedLoginCount;

    /**最后登录时间*/
    private Date lastLoginTime;

    /**登陆次数*/
    private Integer loginCount;

    /**用户属性类型*/
    private String userAttrType;

    /**用户业务类型*/
    private String userBizType;

    /**注册IP*/
    private String registIp;

    /**注册时间*/
    private Date registTime;

    /**状态*/
    private Long active;

    /**是否锁定*/
    private String validFlag;

    /**省份*/
    private String country;

    /**城市*/
    private String area;

    /**身份*/
    private String identity;

    /**用户多密码标识*/
    private String multiPassword;

    /**设备*/
    private String equip;

    /**创建时间*/
    private Date createTime;

    /**更新时间*/
    private Date updateTime;

    /**微信OpenId*/
    private String openId;

    /**联系人姓名*/
    private String contactName;

    /**所属组群*/
    private String groupId;

    /**员工Flg*/
    private String staffFlg;

    /**外部来源*/
    private String outsideType;

         
    public DcAccount() {

    }

    /**获取ID*/
    public String getAccountId() {
        return accountId;
    }

    /**设置ID*/
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    /**获取USER_ID*/
    public String getUserid() {
        return userid;
    }

    /**设置USER_ID*/
    public void setUserid(String userid) {
        this.userid = userid;
    }
    /**获取真实姓名*/
    public String getUserName() {
        return userName;
    }

    /**设置真实姓名*/
    public void setUserName(String userName) {
        this.userName = userName;
    }
    /**获取用户名*/
    public String getAccount() {
        return account;
    }

    /**设置用户名*/
    public void setAccount(String account) {
        this.account = account;
    }
    /**获取手机号*/
    public String getCelphone() {
        return celphone;
    }

    /**设置手机号*/
    public void setCelphone(String celphone) {
        this.celphone = celphone;
    }
    /**获取身份证号*/
    public String getIdNum() {
        return idNum;
    }

    /**设置身份证号*/
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
    /**获取邮箱*/
    public String getEmail() {
        return email;
    }

    /**设置邮箱*/
    public void setEmail(String email) {
        this.email = email;
    }
    /**获取地址*/
    public String getAddress() {
        return address;
    }

    /**设置地址*/
    public void setAddress(String address) {
        this.address = address;
    }
    /**获取性别*/
    public String getGender() {
        return gender;
    }

    /**设置性别*/
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**获取生日*/
    public Date getBirthday() {
        return birthday;
    }

    /**设置生日*/
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    /**获取密码*/
    public String getPassword() {
        return password;
    }

    /**设置密码*/
    public void setPassword(String password) {
        this.password = password;
    }
    /**获取秘钥*/
    public String getPasswordSalt() {
        return passwordSalt;
    }

    /**设置秘钥*/
    public void setPasswordSalt(String passwordSalt) {
        this.passwordSalt = passwordSalt;
    }
    /**获取操作密码*/
    public String getOptPassword() {
        return optPassword;
    }

    /**设置操作密码*/
    public void setOptPassword(String optPassword) {
        this.optPassword = optPassword;
    }
    /**获取操作密码秘钥*/
    public String getOptPasswordSalt() {
        return optPasswordSalt;
    }

    /**设置操作密码秘钥*/
    public void setOptPasswordSalt(String optPasswordSalt) {
        this.optPasswordSalt = optPasswordSalt;
    }
    /**获取失败登陆次数*/
    public Integer getFailedLoginCount() {
        return failedLoginCount;
    }

    /**设置失败登陆次数*/
    public void setFailedLoginCount(Integer failedLoginCount) {
        this.failedLoginCount = failedLoginCount;
    }
    /**获取最后登录时间*/
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**设置最后登录时间*/
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    /**获取登陆次数*/
    public Integer getLoginCount() {
        return loginCount;
    }

    /**设置登陆次数*/
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }
    /**获取用户属性类型*/
    public String getUserAttrType() {
        return userAttrType;
    }

    /**设置用户属性类型*/
    public void setUserAttrType(String userAttrType) {
        this.userAttrType = userAttrType;
    }
    /**获取用户业务类型*/
    public String getUserBizType() {
        return userBizType;
    }

    /**设置用户业务类型*/
    public void setUserBizType(String userBizType) {
        this.userBizType = userBizType;
    }
    /**获取注册IP*/
    public String getRegistIp() {
        return registIp;
    }

    /**设置注册IP*/
    public void setRegistIp(String registIp) {
        this.registIp = registIp;
    }
    /**获取注册时间*/
    public Date getRegistTime() {
        return registTime;
    }

    /**设置注册时间*/
    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }
    /**获取状态*/
    public Long getActive() {
        return active;
    }

    /**设置状态*/
    public void setActive(Long active) {
        this.active = active;
    }
    /**获取是否锁定*/
    public String getValidFlag() {
        return validFlag;
    }

    /**设置是否锁定*/
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }
    /**获取省份*/
    public String getCountry() {
        return country;
    }

    /**设置省份*/
    public void setCountry(String country) {
        this.country = country;
    }
    /**获取城市*/
    public String getArea() {
        return area;
    }

    /**设置城市*/
    public void setArea(String area) {
        this.area = area;
    }
    /**获取身份*/
    public String getIdentity() {
        return identity;
    }

    /**设置身份*/
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    /**获取用户多密码标识*/
    public String getMultiPassword() {
        return multiPassword;
    }

    /**设置用户多密码标识*/
    public void setMultiPassword(String multiPassword) {
        this.multiPassword = multiPassword;
    }
    /**获取设备*/
    public String getEquip() {
        return equip;
    }

    /**设置设备*/
    public void setEquip(String equip) {
        this.equip = equip;
    }
    /**获取创建时间*/
    public Date getCreateTime() {
        return createTime;
    }

    /**设置创建时间*/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    /**获取更新时间*/
    public Date getUpdateTime() {
        return updateTime;
    }

    /**设置更新时间*/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    /**获取微信OpenId*/
    public String getOpenId() {
        return openId;
    }

    /**设置微信OpenId*/
    public void setOpenId(String openId) {
        this.openId = openId;
    }
    /**获取联系人姓名*/
    public String getContactName() {
        return contactName;
    }

    /**设置联系人姓名*/
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    /**获取所属组群*/
    public String getGroupId() {
        return groupId;
    }

    /**设置所属组群*/
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    /**获取员工Flg*/
    public String getStaffFlg() {
        return staffFlg;
    }

    /**设置员工Flg*/
    public void setStaffFlg(String staffFlg) {
        this.staffFlg = staffFlg;
    }
    /**获取外部来源*/
    public String getOutsideType() {
        return outsideType;
    }

    /**设置外部来源*/
    public void setOutsideType(String outsideType) {
        this.outsideType = outsideType;
    }

    public String toString() {
        return "DcAccount ["
        + ", accountId=" + accountId
        + ", userid=" + userid
        + ", userName=" + userName
        + ", account=" + account
        + ", celphone=" + celphone
        + ", idNum=" + idNum
        + ", email=" + email
        + ", address=" + address
        + ", gender=" + gender
        + ", birthday=" + birthday
        + ", password=" + password
        + ", passwordSalt=" + passwordSalt
        + ", optPassword=" + optPassword
        + ", optPasswordSalt=" + optPasswordSalt
        + ", failedLoginCount=" + failedLoginCount
        + ", lastLoginTime=" + lastLoginTime
        + ", loginCount=" + loginCount
        + ", userAttrType=" + userAttrType
        + ", userBizType=" + userBizType
        + ", registIp=" + registIp
        + ", registTime=" + registTime
        + ", active=" + active
        + ", validFlag=" + validFlag
        + ", country=" + country
        + ", area=" + area
        + ", identity=" + identity
        + ", multiPassword=" + multiPassword
        + ", equip=" + equip
        + ", createTime=" + createTime
        + ", updateTime=" + updateTime
        + ", openId=" + openId
        + ", contactName=" + contactName
        + ", groupId=" + groupId
        + ", staffFlg=" + staffFlg
        + ", outsideType=" + outsideType
        + "]";
    }

}
