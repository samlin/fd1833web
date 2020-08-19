package com.fd.service.impl;

import com.fd.dao.UserDAO;
import com.fd.dao.impl.UserDAOImpl;
import com.fd.service.UserService;

/**
 * 定义MVC的Service层的实现类
 */
public class UserServiceImpl implements UserService {

    //在Service中定义DAO
    private UserDAO userDAO = new UserDAOImpl();
    @Override
    public String getUserName() {
        return "Service--> "+userDAO.getUserName();
    }
}
