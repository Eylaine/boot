package com.zzl.boot.controller.user;

import com.zzl.boot.controller.BaseController;
import com.zzl.boot.service.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Description:
 * Date: 2018/11/14
 *
 * @author: Eylaine
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public String addUser(@RequestBody String userJson) {
        String resultInfo = "";
        try {
            resultInfo = userService.addUser(userJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    @ResponseBody
    public String getUserByName(@PathVariable String userName) {
        String resultInfo = "";
        try {
            resultInfo = userService.getUserByName(userName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultInfo;
    }

}
