package com.stgh.forum.service;

import com.stgh.forum.pojo.Comment;

import java.util.List;

public interface CommentService {
    String addComment(Comment comment);
    String addReply(Comment comment);
    String deleteComment(Integer cid);
    String updateComment(Comment comment);
    List<Comment> listCommentByPid(Integer pid);
    List<Comment> listReplyByCid(Integer cid);
    List<Comment> listCommentByUid(Integer uid);
    Comment getLastComment(Integer pid);
}
