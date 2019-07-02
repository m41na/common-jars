package com.practicaldime.common.entity.todos;


import java.util.Date;

public class BackLogItem  {

    private Long id;
    private String task;
    private boolean done;
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

    public BackLogItem() {
        super();
    }

    public BackLogItem(String item) {
        super();
        this.task = item;
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
