package com.fd.dao.impl;

import com.fd.dao.UserDAO;

import java.util.Date;

/**
 * 定义MVC中Model层的实现类
 */
public class UserDAOImpl implements UserDAO {
    @Override
    public String getUserName() {
        return "FD User Name "+new Date();
    }
}
