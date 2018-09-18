package com.stgh.forum.pojo;

import org.springframework.stereotype.Component;


@Component
public class Post {
    private Integer pid;
    private Integer uid;
    private String title;
    private String  postText;
    private String createTime;
    private String updateTime;
    private Integer commentNum;
    private String lastCommentTime;
    private String lastCommentUser;
    private boolean isDeleted;
    private String userName;

    @Override
    public String toString() {
        return "Post{" +
                "pid=" + pid +
                ", uid=" + uid +
                ", title='" + title + '\'' +
                ", postText='" + postText + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", commentNum=" + commentNum +
                ", lastCommentTime='" + lastCommentTime + '\'' +
                ", lastCommentUser='" + lastCommentUser + '\'' +
                ", isDeleted=" + isDeleted +
                ", userName='" + userName + '\'' +
                '}';
    }

    public String getLastCommentUser() {
        return lastCommentUser;
    }

    public void setLastCommentUser(String lastCommentUser) {
        this.lastCommentUser = lastCommentUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public String getLastCommentTime() {
        return lastCommentTime;
    }

    public void setLastCommentTime(String lastCommentTime) {
        this.lastCommentTime = lastCommentTime;
    }


    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

}
