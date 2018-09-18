package com.stgh.forum.service.Impl;

import com.stgh.forum.mapper.PostMapper;
import com.stgh.forum.pojo.Comment;
import com.stgh.forum.pojo.Post;
import com.stgh.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostMapper postMapper;

    @Override
    public String newPost(Post post) {
        if(postMapper.insertPost(post)==1){
            return "发帖成功";
        }else {
            return "发帖失败";
        }
    }

    @Override
    public String deletePost(int pid) {
        if(postMapper.deletePostByPid(pid)==1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }

    @Override
    public String updatePost(Post post) {
        if(postMapper.updatePost(post)==1){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

    @Override
    public String setLastInfo(@RequestBody Comment comment) {
        if(postMapper.setLastInfo(comment)==1){
            return "更新成功";
        }
        return "更新失败";
    }

    @Override
    public String addCommentNum(@RequestBody Comment comment) {
        postMapper.addCommentNum(comment);
        return "回复增加";
    }

    @Override
    public Post getPostByTitle(String title) {
        return postMapper.selectPostByTitle(title);
    }

    @Override
    public List<Post> listPostsByUser(int uid) {
        return  postMapper.selectPostByUid(uid);
    }

    @Override
    public List<Post> searchPost(String keyWord) {
        return postMapper.selectPostByKeyWord(keyWord);
    }

    @Override
    public List<Post> getAllPosts() {
        return postMapper.getAllPosts();
    }
}
