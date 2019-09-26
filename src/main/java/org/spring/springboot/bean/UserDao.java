package org.spring.springboot.bean;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;


public interface UserDao {
    public boolean inputUsers(User user);
    public User showUsers(Integer uid);
    public User userLogin(String email);
}
