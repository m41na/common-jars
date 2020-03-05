package com.practicaldime.common.entity.games;

import java.util.HashSet;
import java.util.Set;


public class Wordlets {

    private Long id;
    private Long attempts;
    private Integer points;
    private Set<String> combinations = new HashSet<>();
    private Long bestTime;
    private Difficulty level;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAttempts() {
        return attempts;
    }

    public void setAttempts(Long attempts) {
        this.attempts = attempts;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Set<String> getCombinations() {
        return combinations;
    }

    public void setCombinations(Set<String> combinations) {
        this.combinations = combinations;
    }

    public Long getBestTime() {
        return bestTime;
    }

    public void setBestTime(Long bestTime) {
        this.bestTime = bestTime;
    }

    public Difficulty getLevel() {
        return level;
    }

    public void setLevel(Difficulty level) {
        this.level = level;
    }
}
