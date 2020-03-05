package com.practicaldime.common.entity.scrum;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Objects;

public class FlashCard implements Comparable<FlashCard> {

    private Long refId;

    @NotNull(message = "reference team id is a required field")
    private Long teamId;

    @NotNull(message = "reference profile id is a required field")
    private Long profileId;

    @NotNull(message = "team title should use referenced team's title if none is supplied")
    private String team;

    @NotNull(message = "player name should reference referenced account's username if none is supplied.")
    private String player;

    @NotNull(message = "topic refers to the currently active subject")
    private String topic;

    @NotNull(message = "player's pick is a required field")
    private String pick;

    private Date submitTime;

    public FlashCard() {
        super();
    }

    public FlashCard(Long refId, Long teamId, Long profileId, String team, String player, String topic, String pick, Date submitTime) {
        this.refId = refId;
        this.teamId = teamId;
        this.profileId = profileId;
        this.team = team;
        this.player = player;
        this.topic = topic;
        this.pick = pick;
        this.submitTime = submitTime;
    }

    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
    }

    public Long getProfileId() {
        return profileId;
    }

    public void setProfileId(Long profileId) {
        this.profileId = profileId;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FlashCard)) return false;
        FlashCard flashCard = (FlashCard) o;
        return refId.equals(flashCard.refId) &&
                teamId.equals(flashCard.teamId) &&
                profileId.equals(flashCard.profileId) &&
                team.equals(flashCard.team) &&
                player.equals(flashCard.player) &&
                Objects.equals(topic, flashCard.topic) &&
                Objects.equals(pick, flashCard.pick) &&
                Objects.equals(submitTime, flashCard.submitTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refId, teamId, profileId, team, player);
    }

    @Override
    public String toString() {
        return "FlashCard{" +
                "refId='" + refId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", profileId='" + profileId + '\'' +
                ", team='" + team + '\'' +
                ", player='" + player + '\'' +
                ", topic='" + topic + '\'' +
                ", pick='" + pick + '\'' +
                '}';
    }

    @Override
    public int compareTo(FlashCard o) {
        if (this == o) {
            return 0;
        }
        int compare = this.getTeamId().compareTo(o.getTeamId());
        if (compare != 0) {
            return compare;
        }
        compare = this.getProfileId().compareTo(o.getProfileId());
        if (compare != 0) {
            return compare;
        }
        compare = this.getPlayer().compareTo(o.getPlayer());
        if (compare != 0) {
            return compare;
        }
        return this.getTeam().compareTo(o.getTeam());
    }
}
