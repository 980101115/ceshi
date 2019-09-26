package org.spring.springboot.service;

import org.spring.springboot.domain.Classer;
import org.spring.springboot.domain.Fcomment;
import org.spring.springboot.domain.Lcomment;
import org.spring.springboot.domain.User;

import java.util.List;

public interface FcommentService {
    public Classer showFcommentClass(Integer cid);
    public String showFcommentUpper(Integer cid);
    public List<User> showFcommentUser(Integer cid);
    public List<Fcomment> showFcomment(Integer cid);
    public boolean inputFcomment(Fcomment fcomment);
    public List<Lcomment> showLcomment(Integer cid);
}
