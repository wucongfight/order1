package com.yijiupi.service.impl;

import com.yijiupi.entity.TemporaryUser;
import com.yijiupi.entity.User;
import com.yijiupi.mapper.UserMapper;
import com.yijiupi.service.UserService;
import com.yijiupi.unit.Md5;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Service
public class UserServiceImpl implements UserService {

    private UserMapper userMapper;

    @Resource
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int insert(User record) {
        //加密后的密码
        String s = Md5.string(record.getPassword());
        record.setPassword(s);
        return this.userMapper.insert(record);
    }


    @Override
    public Boolean selectByPrimaryKey(User user) {
        User userOrigin = this.userMapper.selectByPrimaryKey(user.getUsername());
        String password = Md5.string(user.getPassword());
        return userOrigin.getPassword().equals(password);


    }

    @Override
    public Boolean updateByPrimaryKey(TemporaryUser temporaryUser) {
        String s = Md5.string(temporaryUser.getPassword());
        User user = this.userMapper.selectByPrimaryKey(temporaryUser.getUsername());
        int key = 0;
        if (user.getPassword().equals(s)) {
            user.setPassword(temporaryUser.getNowPassword());
            key = this.userMapper.updateByPrimaryKey(user);
        }
        return key > 0;


    }
}
