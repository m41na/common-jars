package com.practicaldime.domain.backlog;

import java.util.List;

import com.practicaldime.domain.users.Account;
import com.practicaldime.domain.users.BaseEntity;

public class BackLogList extends BaseEntity {

    private String title;
    private Account owner;
    private List<BackLogItem> items;

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
