package com.sicredi.voting.voting.domain;

import com.google.common.base.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "votes")
public class Vote {

    @MongoId
    private String id;

    private Associate associate;

    private boolean favorable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Associate getAssociate() {
        return associate;
    }

    public void setAssociate(Associate associate) {
        this.associate = associate;
    }

    public boolean isFavorable() {
        return favorable;
    }

    public void setFavorable(boolean favorable) {
        this.favorable = favorable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vote)) return false;
        Vote vote = (Vote) o;
        return isFavorable() == vote.isFavorable() && Objects.equal(getId(), vote.getId()) && Objects.equal(getAssociate(), vote.getAssociate());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getAssociate(), isFavorable());
    }
}
