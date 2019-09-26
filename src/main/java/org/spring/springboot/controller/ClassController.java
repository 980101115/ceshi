package org.spring.springboot.controller;

import org.spring.springboot.domain.Grouper;
import org.spring.springboot.service.ClassService;
import org.spring.springboot.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping("/class")
    public String showClass(HttpServletRequest request, Integer gid) {
        request.setAttribute("classer", classService.showClass(gid));
        request.setAttribute("grouper", classService.showGroupByid(gid));
        String id = request.getParameter("uid");
        request.setAttribute("uid", id);
        return "class";
    }
}
