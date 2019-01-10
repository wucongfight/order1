package com.yijiupi.service.impl;

import com.yijiupi.entity.User;
import com.yijiupi.mapper.UserMapper;
import com.yijiupi.service.UserService;
import com.yijiupi.unit.MD5;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public int insert(User record) {
        //加密后的密码
        String s = MD5.stringMD5(record.getPassword());
        record.setPassword(s);
        return this.userMapper.insert(record);
    }


    @Override
    public Boolean selectByPrimaryKey(User user) {
        User userOrgin = this.userMapper.selectByPrimaryKey(user.getUsername());
        String password = MD5.stringMD5(user.getPassword());
        if( password.equals(userOrgin)){
            return true;
        }else {
            return false;
        }


    }

    @Override
    public int updateByPrimaryKey(User record) {
        String s = MD5.stringMD5(record.getPassword());
        record.setPassword(s);
        return this.userMapper.updateByPrimaryKey(record);
    }
}
