package com.demo.service.impl;

import com.demo.common.model.User;
import com.demo.service.UserService;
import com.jfinal.aop.Inject;
import com.jfinal.plugin.activerecord.Db;


import java.util.List;


public class UserServiceImpl implements UserService {


    @Override
    public boolean userLogin() {
        return false;
    }

    @Override
    public User getUserById(long id) {
        List<Object> select_id_from_user = Db.query("select id from user", id);
        return (User) select_id_from_user;
    }

    @Override
    public List getUserList() {
        List<Object> query = Db.query("select * from user");
        return query;

    }
}
