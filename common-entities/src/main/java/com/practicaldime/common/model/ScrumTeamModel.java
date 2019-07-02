package com.practicaldime.common.model;

import com.practicaldime.common.entity.scrum.ScrumTeam;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ScrumTeamModel implements RequestModel<ScrumTeam>, Comparable<ScrumTeamModel>{

    public String teamId;
    public String title;
    public String organizer;
    public Boolean guest = Boolean.TRUE;
    public Boolean locked = Boolean.FALSE;
    public Date createdTs;
    public String picks = "1,2,3,5,8,13,21";

    public ScrumTeamModel() {
        super();
    }
    
    public ScrumTeamModel(ScrumTeam entity) {
        super();
        this.teamId = entity.getId();
        this.title = entity.getTitle();
        this.organizer = entity.getOrganizer();
        this.locked = entity.getLocked();
        this.createdTs = entity.getCreatedTs();
        this.picks = Arrays.toString(entity.getPicks());
    }

    public ScrumTeamModel(String title, String organizer) {
        this();
        this.title = title;
        this.organizer = organizer;
        this.guest = Boolean.TRUE;
        this.locked = Boolean.FALSE;
        this.createdTs = new Date();
        this.picks = "1,2,3,5,8,13,21";
    }
    
    @Override
    public ModelFields validate() {
        ModelFields errors = new ModelFields();
        if(title == null || title.trim().length() == 0){
            errors.put("title", title, "title is a required field");
        }
        
        if(organizer == null || organizer.trim().length() == 0){
            errors.put("organizer", organizer, "organizer is a required field");
        }
        
        if(picks == null || picks.trim().length() == 0){
            errors.put("picks", picks, "picks is a required field");
        }
        return errors;
    }

    @Override
    public ScrumTeam entity() {
        ScrumTeam team = new ScrumTeam();
        team.setCreatedTs(createdTs);
        List<String> list = Arrays.stream(picks.split("(,|\\s)")).filter(e->(e != null && e.length() > 0)).collect(Collectors.toList());
        team.setPicks(list.toArray(new String[list.size()]));
        team.setId(teamId);
        team.setOrganizer(organizer);
        team.setTitle(title);
        team.setLocked(locked);
        return team;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.title);
        hash = 29 * hash + Objects.hashCode(this.organizer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ScrumTeamModel other = (ScrumTeamModel) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.organizer, other.organizer)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(ScrumTeamModel o) {
        if (this == o) {
            return 0;
        }
        int compare = this.organizer.compareTo(o.organizer);
        if(compare != 0) {
        	return compare;
        }
        return this.title.compareTo(o.title);
    }
}
