package com.yijiupi.mapper;


import com.yijiupi.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: WuCong
 * @Date: 2019/1/17 11:11
 */
@Mapper
public interface UserMapper {
    /**
     * 根据用户id删除用户
     *
     * @param username
     * @return
     */
    int deleteByPrimaryKey(String username);

    /**
     * 新增用户
     *
     * @param record
     * @return
     */
    int insert(User record);

    /**
     * 根据用户名查询用户信息
     *
     * @param username
     * @return
     */
    User selectByPrimaryKey(String username);

    /**
     * 更新用户信息
     *
     * @param record
     * @return
     */
    int updateByPrimaryKey(User record);
}