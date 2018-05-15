package com.xqq.app.service;

import com.xqq.app.domain.Users;

import java.util.List;

public interface DataService {

    List<Users> listUsers();

    int saveUser(Users user);

    int updateUser(Users user);

    int deleteUser(String id);
}
