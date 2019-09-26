package org.spring.springboot.service;


import org.spring.springboot.domain.User;

import java.util.List;

public interface UserService {
    public boolean inputUsers(User user);
    public User showUsers(Integer uid);
    public User userLogin(String eamil);

}
