package com.example.testverstka;

public class VoteMainDescription {

    public String voteMainText;
    public String voteInitiator;
    public String voteType;
    public String voteDate;

    public VoteMainDescription(String voteMainText, String voteInitiator, String voteType, String voteDate) {
        this.voteMainText = voteMainText;
        this.voteInitiator = voteInitiator;
        this.voteType = voteType;
        this.voteDate = voteDate;
    }

    public String getVoteMainText() {
        return voteMainText;
    }

    public void setVoteMainText(String voteMainText) {
        this.voteMainText = voteMainText;
    }

    public String getVoteInitiator() {
        return voteInitiator;
    }

    public void setVoteInitiator(String voteInitiator) {
        this.voteInitiator = voteInitiator;
    }

    public String getVoteType() {
        return voteType;
    }

    public void setVoteType(String voteType) {
        this.voteType = voteType;
    }

    public String getVoteDate() {
        return voteDate;
    }

    public void setVoteDate(String voteDate) {
        this.voteDate = voteDate;
    }
}

