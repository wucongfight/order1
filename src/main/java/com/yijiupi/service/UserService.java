package com.yijiupi.service;

import com.yijiupi.entity.TemporaryUser;
import com.yijiupi.entity.User;

public interface UserService {
    int insert(User record);

    Boolean selectByPrimaryKey(User user);

    Boolean updateByPrimaryKey(TemporaryUser record);
}
