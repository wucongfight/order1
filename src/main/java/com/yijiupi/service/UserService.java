package com.yijiupi.service;

import com.yijiupi.entity.TemporaryUser;
import com.yijiupi.entity.User;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
public interface UserService {
    /**
     * 增加新用户
     *
     * @param record 用户
     * @return
     */
    int insert(User record);

    /**
     * 验证用户的信息
     *
     * @param user 用户
     * @return
     */
    Boolean selectByPrimaryKey(User user);

    /**
     * 验证用户的信息在修改信息
     *
     * @param record 用户
     * @return
     */
    Boolean updateByPrimaryKey(TemporaryUser record);
}
