package com.practicaldime.common.model;

import com.practicaldime.common.entity.scrum.FlashCard;

import java.util.Date;
import java.util.Objects;

public class FlashCardModel implements RequestModel<FlashCard>, Comparable<FlashCardModel>{

    public String teamId;
    public String player;
    public Date datetime;
    public String pick;
    public String[] picks;

    public FlashCardModel() {
        super();
    }
    
    public FlashCardModel(FlashCard entity) {
        super();
        this.teamId = entity.getTeam();
        this.player = entity.getPlayer();
        this.datetime = entity.getSubmitTime();
        this.pick = entity.getPick();
    }

    public FlashCardModel(String teamId, String player) {
        this();
        this.player = player;
        this.teamId = teamId;
    }
    
    @Override
    public ModelFields validate() {
        ModelFields errors = new ModelFields();
        if(player == null || player.trim().length() == 0){
            errors.put("player", player, "player is a required field");
        }
        
        if(pick == null || pick.trim().length() == 0){
            errors.put("pick", pick, "pick is a required field");
        }
        
        if(teamId == null || pick.trim().length() == 0){
            errors.put("teamId", teamId, "teamId is a required field");
        }
        return errors;
    }

    @Override
    public FlashCard entity() {
        FlashCard card = new FlashCard();
        card.setTeam(teamId);
        card.setSubmitTime(datetime);
        card.setPick(pick);
        card.setPlayer(player);
        return card;
    }    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.player);
        hash = 11 * hash + Objects.hashCode(this.teamId);
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
        final FlashCardModel other = (FlashCardModel) obj;
        if (!Objects.equals(this.player, other.player)) {
            return false;
        }
        return Objects.equals(this.teamId, other.teamId);
    }

    @Override
    public int compareTo(FlashCardModel o) {
        if (this == o) {
            return 0;
        }
        int compare = this.player.compareTo(o.player);
        if(compare != 0) {
        	return compare;
        }
        return teamId.compareTo(o.teamId);
    }
}
