package com.fd.service;

import com.fd.dao.UserDAOImal;
import com.fd.dao.UserDao;

public class UserService {
    public String getUserName() {
        UserDao userDao = new UserDAOImal();
        return userDao.getName();
    }
}
