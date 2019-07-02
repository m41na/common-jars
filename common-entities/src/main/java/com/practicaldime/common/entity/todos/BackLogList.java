package com.practicaldime.common.entity.todos;

import com.practicaldime.common.entity.users.Account;

import java.util.Date;
import java.util.List;

public class BackLogList  {

    private Long id;
    private String title;
    private Account owner;
    private List<BackLogItem> items;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Account getOwner() {
        return owner;
    }

    public void setOwner(Account owner) {
        this.owner = owner;
    }

    public List<BackLogItem> getItems() {
        return items;
    }

    public void setItems(List<BackLogItem> items) {
        this.items = items;
    }
}
