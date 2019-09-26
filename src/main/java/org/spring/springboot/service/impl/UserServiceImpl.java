package org.spring.springboot.service.impl;


import org.spring.springboot.bean.UserDao;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public boolean inputUsers(User user) {
        return userDao.inputUsers(user);
    }
    public User showUsers(Integer uid) {
        return userDao.showUsers(uid);
    }
    public User userLogin(String email){
        return userDao.userLogin(email);

    };


}



