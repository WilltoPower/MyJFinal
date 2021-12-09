package com.demo.service;

import com.demo.common.model.User;
import com.demo.common.model.base.BaseUser;

import java.util.List;

public interface UserService {


    public boolean userLogin();

    public User getUserById(long id) ;

    List getUserList();
}
