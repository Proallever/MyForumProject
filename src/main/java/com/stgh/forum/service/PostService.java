package com.stgh.forum.service;

import com.stgh.forum.pojo.Comment;
import com.stgh.forum.pojo.Post;


import java.util.List;

public interface PostService {
    String newPost(Post post);
    String deletePost(int pid);
    String updatePost(Post post);
    String setLastInfo(Comment comment);
    String addCommentNum(Comment comment);
    Post getPostByTitle(String title);
    List<Post> listPostsByUser(int uid);
    List<Post> searchPost(String keyWord);
    List<Post> getAllPosts();
}
