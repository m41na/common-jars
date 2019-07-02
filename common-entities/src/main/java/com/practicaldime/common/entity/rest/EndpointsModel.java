package com.practicaldime.common.entity.rest;

public class EndpointsModel {

    private long currentCollection;
    private String currentEndpoint;
    private String currentMode;
    private UserEndpoints model;

    public EndpointsModel(UserEndpoints model) {
        super();
        this.model = model;
        this.currentMode = "normal";
        //Consider using 'EndpointsUtil.newEndpointsModel()' to create and initialize this class
    }

    public long getCurrentCollection() {
        return currentCollection;
    }

    public void setCurrentCollection(long currentCollection) {
        this.currentCollection = currentCollection;
    }

    public String getCurrentEndpoint() {
        return currentEndpoint;
    }

    public void setCurrentEndpoint(String currentEndpoint) {
        this.currentEndpoint = currentEndpoint;
    }

    public String getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(String currentMode) {
        this.currentMode = currentMode;
    }

    public UserEndpoints getModel() {
        return model;
    }

    public void setModel(UserEndpoints model) {
        this.model = model;
    }
}
