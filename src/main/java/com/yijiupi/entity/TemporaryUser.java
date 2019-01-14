package com.yijiupi.entity;

public class TemporaryUser {
    private String username;

    private String password; //老密码

    private String nowPassword; // 新密码

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
