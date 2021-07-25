package com.sicredi.voting.voting.domain.request;

import com.google.common.base.Objects;

import java.io.Serializable;

public class TopicRequest implements Serializable{
    private static final long serialVersionUID = 4011556253679507550L;

    private String subject;

    private String description;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TopicRequest)) return false;
        TopicRequest that = (TopicRequest) o;
        return Objects.equal(getSubject(), that.getSubject()) && Objects.equal(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSubject(), getDescription());
    }
}
