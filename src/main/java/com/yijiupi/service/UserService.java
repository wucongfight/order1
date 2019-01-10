package com.yijiupi.service;

import com.yijiupi.entity.User;

public interface UserService {
    int insert(User record);

    Boolean selectByPrimaryKey(User user);

    int updateByPrimaryKey(User record);
}
