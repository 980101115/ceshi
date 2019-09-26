package org.spring.springboot.bean;

import org.spring.springboot.domain.Classer;
import org.spring.springboot.domain.Grouper;

import java.util.List;

public interface ClassDao {
    public List<Classer> showClass(Integer gid);
    public Grouper showGroupByid(Integer gid);
}
