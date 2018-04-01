package com.example.utkarsh.cricbuzz;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by utkarsh on 2/4/18.
 */

public class Score {

    @SerializedName("stat")
    @Expose
    private String stat;
    @SerializedName("score")
    @Expose
    private String score;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("matchStarted")
    @Expose
    private Boolean matchStarted;
    @SerializedName("team-1")
    @Expose
    private String team1;
    @SerializedName("team-2")
    @Expose
    private String team2;

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getMatchStarted() {
        return matchStarted;
    }

    public void setMatchStarted(Boolean matchStarted) {
        this.matchStarted = matchStarted;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

}

