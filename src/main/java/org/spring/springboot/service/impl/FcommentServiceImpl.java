package org.spring.springboot.service.impl;

import org.spring.springboot.bean.FcommentDao;
import org.spring.springboot.domain.Classer;
import org.spring.springboot.domain.Fcomment;
import org.spring.springboot.domain.Lcomment;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.FcommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FcommentServiceImpl implements FcommentService {
    @Autowired
    private FcommentDao fcommentDao;
    public Classer showFcommentClass(Integer cid){
        return fcommentDao.showFcommentClass(cid);
    }
    public String showFcommentUpper(Integer cid){
        return fcommentDao.showFcommentUpper(cid);
    }
    public List<User> showFcommentUser(Integer cid){
        return fcommentDao.showFcommentUser(cid);
    }
    public List<Fcomment> showFcomment(Integer cid){
        return fcommentDao.showFcomment(cid);
    }
    public boolean inputFcomment(Fcomment fcomment) {
        return fcommentDao.inputFcomment(fcomment);
    }
    public List<Lcomment> showLcomment(Integer cid) { return fcommentDao.showLcomment(cid); }

}
