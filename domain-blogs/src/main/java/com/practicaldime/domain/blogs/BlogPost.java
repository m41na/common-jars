package com.practicaldime.domain.blogs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.practicaldime.domain.users.BaseEntity;
import com.practicaldime.domain.users.Profile;

public class BlogPost extends BaseEntity {

    private String title;
    private Profile author;
    private String summary;
    private String content;
    private int pageNum;
    private boolean published;
    private final List<String> tags = new ArrayList<>();
    private final List<Comment> comments = new LinkedList<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Profile getAuthor() {
        return author;
    }

    public void setAuthor(Profile author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int seqNum) {
		this.pageNum = seqNum;
	}

	public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }

    public List<String> getTags() {
		return tags;
	}

    public List<Comment> getComments() {
        return comments;
    }
}
