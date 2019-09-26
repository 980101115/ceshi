package org.spring.springboot.service;

import org.spring.springboot.domain.Classer;
import org.spring.springboot.domain.Grouper;

import java.util.List;

public interface ClassService {
    public List<Classer> showClass(Integer gid);
    public Grouper showGroupByid(Integer gid);
}
