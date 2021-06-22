package com.sicredi.voting.voting.domain;

import com.google.common.base.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collation = "schedules")
public class Schedule {

    @MongoId
    private String id;

    private String subject;

    private String description;

    private List<VotingSession> votingSessions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<VotingSession> getVotingSessions() {
        return votingSessions;
    }

    public void setVotingSessions(List<VotingSession> votingSessions) {
        this.votingSessions = votingSessions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Schedule)) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equal(getId(), schedule.getId()) && Objects.equal(getSubject(), schedule.getSubject()) && Objects.equal(getDescription(), schedule.getDescription()) && Objects.equal(getVotingSessions(), schedule.getVotingSessions());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getSubject(), getDescription(), getVotingSessions());
    }
}
