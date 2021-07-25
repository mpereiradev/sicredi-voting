package com.sicredi.voting.voting.domain;

import com.google.common.base.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "topics")
public class Topic {

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
        if (!(o instanceof Topic)) return false;
        Topic topic = (Topic) o;
        return Objects.equal(getId(), topic.getId()) && Objects.equal(getSubject(), topic.getSubject()) && Objects.equal(getDescription(), topic.getDescription()) && Objects.equal(getVotingSessions(), topic.getVotingSessions());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getSubject(), getDescription(), getVotingSessions());
    }
}
