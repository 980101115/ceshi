package org.spring.springboot.controller;


import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.MailService;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;


@Controller
public class UserController {

    @Autowired
    private UserService userService;



//登录
    @RequestMapping("/hindex")

    public String index(){
        return"hindex";
    }

    @RequestMapping("/login")
    public  String userLogin(HttpServletRequest request,String email,String password) {
        System.out.println(email);
        return "hindex";
    }

    @Autowired
    MailService mailService;
    @RequestMapping("/smsg")
    @ResponseBody
    public String getCheckCode(String userNameMail) {

        userNameMail="2279114436@qq.com";
        System.out.println("+++++++++++++++++++++++");
        //userName是邮箱
        String checkCode = String.valueOf(new Random().nextInt(899999) + 100000);
        String message = "您的注册验证码为：" + checkCode;
        try {
            mailService.sendSimpleMail(userNameMail, "注册验证码", message);
        } catch (Exception e) {
            return "";
        }
         return "/reg" ;
    }

//end

    @RequestMapping("/toinputUsers")
    public  String toinputUsers(User user) {
        return "inputUsers";
    }
    @RequestMapping("/inputUsers")
    public String inputUsers(HttpServletRequest request, User user){
        userService.inputUsers(user);
        return "group";
    }




    @RequestMapping("/user")
    public String showUsers(HttpServletRequest request, Integer uid) {
        request.setAttribute("user", userService.showUsers(uid));
        return "user";
    }

    @RequestMapping("/p")
    public String p() {
        return "portfolio";
    }



}



