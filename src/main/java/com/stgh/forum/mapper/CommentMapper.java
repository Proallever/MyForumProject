package com.stgh.forum.mapper;

import com.stgh.forum.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommentMapper {
    Integer insertComment(Comment comment);
    Integer deleteCommentByCid(Integer cid);
    Integer updateComment(Comment comment);
    List<Comment> selectCommentByPid(Integer pid);
    List<Comment> selectCommentByUid(Integer uid);
    List<Comment> selectCommentByCid(Integer cid);
    Comment selectLastComment(Integer pid);
}
