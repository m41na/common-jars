package com.practicaldime.common.entity.blogs;

import com.practicaldime.common.entity.users.Profile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment  {

    private Long id;
    private long parentBlog; 
    private long parentComment;
    private Profile author;
    private String content;
    private boolean published;
    private final List<Comment> feedback = new ArrayList<>();
    private Date dateCreaated = new Date();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateCreaated() {
        return dateCreaated;
    }

    public void setDateCreaated(Date dateCreaated) {
        this.dateCreaated = dateCreaated;
    }

    public long getParentBlog() {
        return parentBlog;
    }

    public void setParentBlog(long parentBlog) {
        this.parentBlog = parentBlog;
    }

    public long getParentComment() {
        return parentComment;
    }

    public void setParentComment(long parentComment) {
        this.parentComment = parentComment;
    }

    public Profile getAuthor() {
        return author;
    }

    public void setAuthor(Profile author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public List<Comment> getFeedback() {
        return feedback;
    }
}
