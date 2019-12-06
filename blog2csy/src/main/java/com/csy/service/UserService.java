package com.csy.service;

import com.csy.po.User;


public interface UserService {

    User checkUser(String username, String password);
}
