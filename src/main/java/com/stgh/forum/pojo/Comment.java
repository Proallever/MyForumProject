package com.stgh.forum.pojo;

import org.springframework.stereotype.Component;

@Component
public class Comment {
    private Integer cid;
    private Integer pid;
    private Integer uid;
    private Integer floor;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    private String createTime;
    private String updateTime;
    private String commentText;

    public Integer getToReply() {
        return toReply;
    }

    public void setToReply(Integer toReply) {
        this.toReply = toReply;
    }

    private Integer toReply;
    private boolean isReply;
    private boolean isDeleted;

    @Override
    public String toString() {
        return "Comment{" +
                "cid=" + cid +
                ", pid=" + pid +
                ", uid=" + uid +
                ", floor=" + floor +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", commentText=" + commentText +
                ", isReply=" + isReply +
                ", isDeleted=" + isDeleted +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
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

    public Object getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public boolean isReply() {
        return isReply;
    }

    public void setReply(boolean reply) {
        isReply = reply;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

}
