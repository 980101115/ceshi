package org.spring.springboot.controller;

import org.spring.springboot.domain.Fcomment;
import org.spring.springboot.service.FcommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class FcommentController {
    @Autowired
    private FcommentService fcommentService;
    @RequestMapping("/comment")
    public String showFcomment(HttpServletRequest request ,Integer cid) {
        request.setAttribute("class", fcommentService.showFcommentClass(cid));
        request.setAttribute("upper", fcommentService.showFcommentUpper(cid));
        request.setAttribute("user", fcommentService.showFcommentUser(cid));
        request.setAttribute("fcomment", fcommentService.showFcomment(cid));
        request.setAttribute("lcomment", fcommentService.showLcomment(cid));
        String uid = request.getParameter("uid");
        request.setAttribute("uid", uid);
        request.setAttribute("cid", cid);
        return "comment";
    }
    @RequestMapping("/inputFcomment")
    public String inputFcomment(HttpServletRequest request, Fcomment fcomment, HttpSession session){
        String u=request.getParameter("uid");
        String c=request.getParameter("cid");

        Integer uid = Integer.parseInt(u);
        Integer cid = Integer.parseInt(c);
        fcomment.setC_id(cid);
        fcomment.setU_id(uid);
        fcommentService.inputFcomment(fcomment);
        String Return = "redirect:/comment?uid=" + uid + "&cid=" + cid;
        return Return;
    }
}