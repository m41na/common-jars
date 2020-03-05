package com.practicaldime.common.entity.todos;


import java.util.Date;

public class BackLogItem {

    private Long id;
    private String task;
    private boolean done;
    private Date createdTs = new Date();

    public BackLogItem() {
        super();
    }

    public BackLogItem(String item) {
        super();
        this.task = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
