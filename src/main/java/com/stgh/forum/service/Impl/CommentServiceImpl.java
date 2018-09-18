package com.stgh.forum.service.Impl;

import com.stgh.forum.mapper.CommentMapper;
import com.stgh.forum.pojo.Comment;
import com.stgh.forum.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public String addComment(Comment comment) {
        if(commentMapper.insertComment(comment)==1){
            return "回复成功";
        }else {
            return "回复失败";
        }
    }

    @Override
    public String addReply(Comment comment) {
        if(commentMapper.insertComment(comment)==1){
            return "回复成功";
        }else {
            return "回复失败";
        }
    }

    @Override
    public String deleteComment(Integer cid) {
        if(commentMapper.deleteCommentByCid(cid)==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @Override
    public String updateComment(Comment comment) {
        if(commentMapper.updateComment(comment)==1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @Override
    public List<Comment> listCommentByPid(Integer pid) {
        return commentMapper.selectCommentByPid(pid);
    }

    @Override
    public List<Comment> listReplyByCid(Integer cid) {
        return commentMapper.selectCommentByCid(cid);
    }

    @Override
    public List<Comment> listCommentByUid(Integer uid) {
        return commentMapper.selectCommentByUid(uid);
    }

    @Override
    public Comment getLastComment(Integer pid) {
        return commentMapper.selectLastComment(pid);
    }
}
