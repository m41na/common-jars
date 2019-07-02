package com.practicaldime.common.entity.scrum;

public class VoteResponse {

    public final Integer status;
    public final String message;

    public VoteResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
