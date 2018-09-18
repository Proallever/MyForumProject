package com.stgh.forum.Controller;

import com.stgh.forum.pojo.Comment;
import com.stgh.forum.service.CommentService;
import com.stgh.forum.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ForumComment")
public class CommentController {

    @Autowired
    private CommentService commentService;
    @Autowired
    private PostService postService;

    @RequestMapping("/addComment")
    public String addComment(@RequestBody Comment comment) {
        postService.addCommentNum(comment);
        postService.setLastInfo(comment);
        return commentService.addComment(comment);
    }

    @RequestMapping("/listCommentByPid")
    public List<Comment> listCommentByPid(Integer pid){
        return commentService.listCommentByPid(pid);
    }

    @RequestMapping("/listCommentByCid")
    public List<Comment> listCommentByCid(Integer cid) { return commentService.listReplyByCid(cid);}

    @RequestMapping("/getLastComment")
    public Comment getLastComment(Integer pid){ return commentService.getLastComment(pid); }
}
