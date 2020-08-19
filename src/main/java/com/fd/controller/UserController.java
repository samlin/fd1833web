package com.fd.controller;

import com.fd.service.UserService;
import com.fd.service.UserServiceImpl;

/**
 * 定义MVC三层中的视图控制层
 */
public class UserController {
//  在视图层引用Service层接口
    private UserService userService=new UserServiceImpl();

    public String getUserName() throws Exception {
        return  userService.getUserName();
    }
}
