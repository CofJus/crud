/**
 * @author CJH
 * 登录controller
 */
package com.hhu.controller;

import com.alibaba.fastjson.JSON;
import com.hhu.repository.UserDao;
import com.hhu.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

//处理前台请求
@RestController
public class LoginController {
    @Autowired
    UserDao userDao;

    @RequestMapping("/login")
    public String login(@RequestBody User user){

        String flag="error";//控制登录成功失败
        int power=0;
        User us=userDao.getUserByMessage(user.getUsername(),user.getPassword());
        System.out.println("user:"+us);
        HashMap<String, Object> res = new HashMap<>();
        if(us!=null)
        {
            flag="ok";
            power=us.state;
        }
        res.put("flag",flag);
        res.put("power",power);
        res.put("user",user);
        String res_json=JSON.toJSONString(res);
        return res_json;

    }
}
