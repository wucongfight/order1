package com.yijiupi.controller;

import com.yijiupi.entity.User;
import com.yijiupi.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
@Controller
public class UserController {

    private UserService userService;


    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> register(@RequestBody User user) {
        this.userService.insert(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    /**
     *用户登录校验
     * @param user
     * @return
     */
    @GetMapping("/{user}")
    public ResponseEntity<Boolean> queryUser(@PathVariable(value = "user") User user) {
        Boolean flag = this.userService.selectByPrimaryKey(user);
        return ResponseEntity.ok(flag);
    }


    /**
     *用户修改密码
     * @param user
     * @return
     */
    @PutMapping
    public ResponseEntity<Void> update(@RequestBody User user){
        this.userService.updateByPrimaryKey(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
