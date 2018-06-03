package com.cims.springboot.web;

import com.cims.springboot.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author kwliu
 * @Description
 * @Date 2018/5/31
 * @Modified
 */
@RestController
@RequestMapping(value = "/users") //默认返回json格式
public class UserController {
    /**
     *创建线程安全的map类
     */
    static Map<Long,User> users =  Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> userList = new ArrayList<User>(users.values());
        return userList;
    }
    @RequestMapping(value = "/",method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        users.put(user.getUid(),user);
        return "success";
    }

    @RequestMapping(value = "/{uid}",method = RequestMethod.GET)
    public User getUser(@PathVariable Long uid) {
        return users.get(uid);
    }


    @PutMapping(value = "/")
    public String putUser(@ModelAttribute User newUser) {
        User oldUser = users.get(newUser.getUid());
        oldUser.setAge(newUser.getAge());
        oldUser.setName(newUser.getName());
        return "success";
    }
    @DeleteMapping(value="/{uid}")
    public String deleteUser(@PathVariable Long uid) {
        users.remove(uid);
        return "success";
    }
}
