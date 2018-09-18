package com.stgh.forum.mapper;

import com.stgh.forum.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    int insertUser(User user);
    User selectByUid(int uid);
    int updateByUid(User user);
    int deleteByUid(int uid);
    List<User> getAll();
    int selectByUserName(User user);
    User selectByUserNameAndPassWord(User user);

}
