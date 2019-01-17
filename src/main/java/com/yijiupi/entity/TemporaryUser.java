package com.yijiupi.entity;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public class TemporaryUser {
    private String username;

    private String password;

    private String nowPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public void setNowPassword(String nowPassword) {
        this.nowPassword = password == null ? null : nowPassword.trim();
    }

    public String getNowPassword() {
        return nowPassword;
    }

}
