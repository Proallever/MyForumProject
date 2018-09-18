package com.stgh.forum.mapper;

import com.stgh.forum.pojo.Comment;
import com.stgh.forum.pojo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {
    int insertPost(Post post);
    int deletePostByPid(int pid);
    int updatePost(Post post);
    Post selectPostByPid(int pid);
    Post selectPostByTitle(String title);
    List<Post> selectPostByUid(int uid);
    List<Post> selectPostByKeyWord(String keyWord);
    List<Post> getAllPosts();
    int setLastInfo(Comment comment);
    int addCommentNum(Comment comment);
}
