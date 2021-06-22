package com.sicredi.voting.voting.domain.response;

import com.google.common.base.Objects;
import com.sicredi.voting.voting.domain.VotingSession;

import java.io.Serializable;
import java.util.List;

public class ScheduleResponse implements Serializable {

    private static final long serialVersionUID = 2383776434073541693L;

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
        if (!(o instanceof ScheduleResponse)) return false;
        ScheduleResponse that = (ScheduleResponse) o;
        return Objects.equal(getId(), that.getId()) && Objects.equal(getSubject(), that.getSubject()) && Objects.equal(getDescription(), that.getDescription()) && Objects.equal(getVotingSessions(), that.getVotingSessions());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getSubject(), getDescription(), getVotingSessions());
    }
}
