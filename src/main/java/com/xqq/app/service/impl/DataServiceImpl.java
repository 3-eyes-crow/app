package com.xqq.app.service.impl;

import com.xqq.app.dao.DataDao;
import com.xqq.app.domain.Users;
import com.xqq.app.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    DataDao dataDao;

    @Override
    public List<Users> listUsers() {
        return dataDao.listUsers();
    }

    @Override
    public int saveUser(Users user) {
        return dataDao.saveUser(user);
    }

    @Override
    public int updateUser(Users user) {
        return dataDao.updateUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return dataDao.deleteUser(id);
    }
}
