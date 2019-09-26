package org.spring.springboot.service.impl;

import org.spring.springboot.bean.ClassDao;
import org.spring.springboot.bean.GroupDao;
import org.spring.springboot.domain.Classer;
import org.spring.springboot.domain.Grouper;
import org.spring.springboot.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ClassServiceImpl implements ClassService {
    @Autowired
    private ClassDao classDao;
    public List<Classer> showClass(Integer gid) {
        return classDao.showClass(gid);
    }
    public Grouper showGroupByid(Integer gid){
        return classDao.showGroupByid(gid);
    }
}