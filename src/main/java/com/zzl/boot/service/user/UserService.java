package com.zzl.boot.service.user;

import com.alibaba.fastjson.JSON;
import com.zzl.boot.dao.UserDao;
import com.zzl.boot.dto.Result;
import com.zzl.boot.entity.User;
import com.zzl.boot.service.BaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Description:
 * Date: 2018/11/14
 *
 * @author: Eylaine
 */
@Service("userService")
public class UserService extends BaseService {

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    /**
     * addUser
     * @param userJson
     * @return
     */
    public String addUser(String userJson) {
        Result<User> result = new Result<>();
        User user = JSON.parseObject(userJson, User.class);
        int count = userDao.countUserName(user.getUserName());
        if (count > 0) {
            result.setCode("400");
            result.setMsg("用户已存在");
            return JSON.toJSONString(result);
        }

        user.setId(getUUID());

        if (userDao.addUser(user)) {
            result.setCode("200");
            result.setData(user);
        } else {
            result.setCode("400");
            result.setMsg("添加失败！");
        }

        return JSON.toJSONString(result);
    }

    public String getUserByName(String userName) {
        Result<User> result = new Result<>();
        User user = userDao.getUserByName(userName);
        result.setCode("200");
        result.setData(user);
        return JSON.toJSONString(result);
    }

}
