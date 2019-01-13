package com.practicaldime.rest.tools.model;

import java.util.ArrayList;
import java.util.List;

public class UserEndpoints {

    private long userId;
    private String userName;
    private ApiReq template;
    private List<EndpointsList> collections = new ArrayList<>();
    private boolean merged = false;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String user) {
        this.userName = user;
    }

    public ApiReq getTemplate() {
        return template;
    }

    public void setTemplate(ApiReq template) {
        this.template = template;
    }

    public List<EndpointsList> getCollections() {
        return collections;
    }

    public void setCollections(List<EndpointsList> collections) {
        this.collections = collections;
    }

    public boolean isMerged() {
        return merged;
    }

	public void setMerged(boolean merged) {
		this.merged = merged;
	}
}
