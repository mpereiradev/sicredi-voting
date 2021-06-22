package com.sicredi.voting.voting.domain;

import com.google.common.base.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;
import java.util.List;

@Document(collation = "voting-sessions")
public class VotingSession {

    @MongoId
    private String id;

    private Schedule schedule;

    private String title;

    private LocalDateTime closing;

    private List<Vote> votes;

    private StatusEnum status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getClosing() {
        return closing;
    }

    public void setClosing(LocalDateTime closing) {
        this.closing = closing;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VotingSession)) return false;
        VotingSession that = (VotingSession) o;
        return Objects.equal(getId(), that.getId()) && Objects.equal(getSchedule(), that.getSchedule()) && Objects.equal(getTitle(), that.getTitle()) && Objects.equal(getClosing(), that.getClosing()) && Objects.equal(getVotes(), that.getVotes()) && getStatus() == that.getStatus();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getSchedule(), getTitle(), getClosing(), getVotes(), getStatus());
    }

    @Override
    public String toString() {
        return "VotingSession{" +
                "id='" + id + '\'' +
                ", schedule=" + schedule +
                ", title='" + title + '\'' +
                ", closing=" + closing +
                ", votes=" + votes +
                ", status=" + status +
                '}';
    }
}
