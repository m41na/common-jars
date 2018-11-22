package com.jarredweb.domain.users;

import java.util.Date;

public class BaseEntity {

    protected long id;
    protected Date createdTs;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createTs) {
        this.createdTs = createTs;
    }
}
