package org.spring.springboot.service.impl;

        import org.spring.springboot.bean.GroupDao;
        import org.spring.springboot.domain.Grouper;
        import org.spring.springboot.service.GroupService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;
    public List<Grouper> showGroup() {
        return groupDao.showGroup();
    }
}


