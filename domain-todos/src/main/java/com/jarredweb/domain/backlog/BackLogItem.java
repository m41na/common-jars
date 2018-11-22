package com.jarredweb.domain.backlog;

import com.jarredweb.domain.users.BaseEntity;

public class BackLogItem extends BaseEntity {

    private String task;
    private boolean done;

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
