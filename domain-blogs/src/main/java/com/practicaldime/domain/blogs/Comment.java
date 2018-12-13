package com.practicaldime.domain.blogs;

import java.util.ArrayList;
import java.util.List;

import com.practicaldime.domain.users.BaseEntity;
import com.practicaldime.domain.users.Profile;

public class Comment extends BaseEntity {

    private long parentBlog; 
    private long parentComment;
    private Profile author;
    private String content;
    private boolean published;
    private final List<Comment> feedback = new ArrayList<>();

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
