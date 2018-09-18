package com.stgh.forum.service.Impl;

import com.stgh.forum.mapper.UserMapper;
import com.stgh.forum.pojo.User;
import com.stgh.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public String addUser(User user) {
        if(userMapper.insertUser(user) == 1){
            return "注册成功";
        }
        return "注册失败";
    }

    @Override
    public String delete(int uid) {
        if(userMapper.deleteByUid(uid) == 1){
            return "删除成功";
        }
        return "删除失败";
    }

    @Override
    public String update(User user) {
        if(userMapper.updateByUid(user) == 1){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public User findById(int uid) {
        return userMapper.selectByUid(uid);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User login(User user) {
        return userMapper.selectByUserNameAndPassWord(user);
    }

    @Override
    public Integer checkUserName(User user) {
        int i = userMapper.selectByUserName(user);
        if(i > 0){
            return 0;
        }else {
            return 1;
        }
    }
}
