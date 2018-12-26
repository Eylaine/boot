package com.zzl.boot.dao;

import com.zzl.boot.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Description:
 * Date: 2018/11/14
 * dao的接口层，用于访问数据库，实现数据的持久化
 * @author: Eylaine
 */
public interface UserDao {

    int countUserName(String userName);

    boolean addUser(User user);

    User getUserByName(String username);

    User getUserById(int id);

    boolean updateUser(User user);

    boolean deleteUserById(int id);

}
