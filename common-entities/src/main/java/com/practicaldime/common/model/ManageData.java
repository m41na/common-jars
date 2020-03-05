package com.practicaldime.common.model;

import java.util.*;

public class ManageData {

    public String username;
    public Set<ScrumTeamModel> teams = new HashSet<>();
    public Set<FlashCardModel> cards = new HashSet<>();
    public Set<String> picks = new HashSet<>();

    public ManageData() {
        super();
    }

    public ManageData(String username, Map<ScrumTeamModel, List<FlashCardModel>> model, Set<String> picks) {
        super();
        this.username = username;
        this.teams.addAll(model.keySet());
        model.values().stream().forEach(e -> this.cards.addAll(e));
        this.picks = picks;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<ScrumTeamModel> getTeams() {
        return teams;
    }

    public void setTeams(Set<ScrumTeamModel> teams) {
        this.teams = teams;
    }

    public void addTeams(Collection<ScrumTeamModel> teams) {
        this.teams.addAll(teams);
    }

    public Set<FlashCardModel> getCards() {
        return cards;
    }

    public void setCards(Set<FlashCardModel> cards) {
        this.cards = cards;
    }

    public void addCards(Collection<FlashCardModel> cards) {
        this.cards.addAll(cards);
    }

    public Set<String> getPicks() {
        return picks;
    }

    public void setPicks(Set<String> picks) {
        this.picks = picks;
    }
}