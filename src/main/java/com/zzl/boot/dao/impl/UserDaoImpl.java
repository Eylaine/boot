package com.zzl.boot.dao.impl;

import com.zzl.boot.dao.UserDao;
import com.zzl.boot.entity.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Description:
 * Date: 2018/11/14
 *
 * @author: Eylaine
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Resource(name = "dbSqlSessionTemplate")
    private SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int countUserName(String userName) {
        return sqlSessionTemplate.selectOne("UserMapper.countUserName", userName);
    }

    @Override
    public boolean addUser(User user) {
        int num = sqlSessionTemplate.insert("UserMapper.addUser", user);
        return num > 0;
    }

    @Override
    public User getUserByName(String username) {
        return sqlSessionTemplate.selectOne("UserMapper.getUserByName", username);
    }

    @Override
    public User getUserById(int id) {
        return sqlSessionTemplate.selectOne("UserMapper.getUserById", id);
    }

    @Override
    public boolean updateUser(User user) {
        int num = sqlSessionTemplate.update("UserMapper.updateUser", user);
        return num > 0;
    }

    @Override
    public boolean deleteUserById(int id) {
        int num = sqlSessionTemplate.delete("UserMapper.deleteUserById", id);
        return num > 0;
    }
}
