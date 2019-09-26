package org.spring.springboot.controller;

import org.spring.springboot.domain.Grouper;
import org.spring.springboot.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GroupController {
    @Autowired
    private GroupService groupService;

    @RequestMapping("/group")
    public String showGroup(HttpServletRequest request , HttpSession session) {
        request.setAttribute("grouper", groupService.showGroup());
        String id = request.getParameter("uid");
        request.setAttribute("uid", id);
         return "group";
    }



}




