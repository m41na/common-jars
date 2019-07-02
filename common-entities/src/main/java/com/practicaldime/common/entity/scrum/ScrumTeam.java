package com.practicaldime.common.entity.scrum;

import com.practicaldime.common.entity.users.Location;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class ScrumTeam implements Comparable<ScrumTeam>{

    private String id;

    @NotNull(message = "team title is a required field")
    @Size(max = 32, message = "max length of team title allowed is 32")
    private String title;

    @NotNull(message = "organizer id is a required field")
    @Size(max = 32, message = "max length of organizer allowed is 32")
    private String organizer;

    private Boolean locked;

    private Location locatedAt;

    private String createdBy;

    private Date createdTs;

    private String[] picks;

    public ScrumTeam() {
        super();
    }

    public ScrumTeam(String id, String title, String organizer, Boolean locked, Location locatedAt, String createdBy, Date createdTs, String[] picks) {
        this.id = id;
        this.title = title;
        this.organizer = organizer;
        this.locked = locked;
        this.locatedAt = locatedAt;
        this.createdBy = createdBy;
        this.createdTs = createdTs;
        this.picks = picks;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Location getLocatedAt() {
        return locatedAt;
    }

    public void setLocatedAt(Location locatedAt) {
        this.locatedAt = locatedAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTs() {
        return createdTs;
    }

    public void setCreatedTs(Date createdTs) {
        this.createdTs = createdTs;
    }

    public String[] getPicks() {
        return picks;
    }

    public void setPicks(String[] picks) {
        this.picks = picks;
    }

    @Override
    public int compareTo(ScrumTeam o) {
        if (this == o) {
            return 0;
        }
        int compare = this.getOrganizer().compareTo(o.getOrganizer());
        if(compare != 0) {
        	return compare;
        }
        return this.getTitle().compareTo(o.getTitle());
    }
}
