package com.zhang.dao;

import com.zhang.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    void save(User user);

    User login(@Param("username") String username,@Param("password") String password);
}
