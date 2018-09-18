package com.stgh.forum.Controller;

import com.stgh.forum.pojo.Post;
import com.stgh.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/ForumPost")
public class PostController {

    @Autowired
    private PostService postService;

    public PostService getPostService(){ return postService;}

    public void setPostService(PostService postService) {
        this.postService = postService;
    }

    @RequestMapping("/newPost")
    public String newPost(@RequestBody Post post){
        return postService.newPost(post);
    }

    @RequestMapping("/listPosts")
    public List<Post> getPostList(){
        return postService.getAllPosts();
    }

    @RequestMapping("/postView")
    public ModelAndView postView(){ return new ModelAndView("PostView"); }

    @RequestMapping("/getPostByTitle")
    public Post getPostByTitle(String title){
        return postService.getPostByTitle(title);
    }
}
