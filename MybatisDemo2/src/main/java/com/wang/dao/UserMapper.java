package com.wang.dao;

import com.wang.pojo.User;

import java.util.List;

public interface UserMapper {
    User getUserById(Integer id);
    List<User> getAllUser();
}
