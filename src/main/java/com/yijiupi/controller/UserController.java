package com.yijiupi.controller;

import com.yijiupi.entity.TemporaryUser;
import com.yijiupi.entity.User;
import com.yijiupi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */

@RequestMapping("user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * 用户注册
     *
     * @param user 用户
     * @return
     */
    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody User user) {
        this.userService.insert(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     * 用户登录校验
     *
     * @param user 用户
     * @return
     */
    @PostMapping("/login")
    public ResponseEntity<Boolean> queryUser(@RequestBody User user) {
        Boolean flag = this.userService.selectByPrimaryKey(user);
        return ResponseEntity.ok(flag);
    }


    /**
     * 用户修改密码
     *
     * @param temporaryUser 临时用户
     * @return
     */
    @PutMapping
    public ResponseEntity<Boolean> update(@RequestBody TemporaryUser temporaryUser) {
        Boolean flag = this.userService.updateByPrimaryKey(temporaryUser);
        return ResponseEntity.ok(flag);
    }
}
