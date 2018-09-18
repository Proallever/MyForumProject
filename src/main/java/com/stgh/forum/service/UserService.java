package com.stgh.forum.service;

import com.stgh.forum.pojo.User;

import java.util.List;

public interface UserService {
    String addUser(User user);
    String delete(int uid);
    String update(User user);
    User findById(int uid);
    List<User> getAll();
    User login(User user);
    Integer checkUserName(User user);
}
