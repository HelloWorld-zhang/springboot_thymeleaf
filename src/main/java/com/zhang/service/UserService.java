package com.zhang.service;

import com.zhang.entity.User;

public interface UserService {

    void register(User user);
    User login(String username,String password);
}
