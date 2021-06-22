package com.sicredi.voting.voting.domain;

import com.google.common.base.Objects;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collation = "associates")
public class Associate {

    @MongoId
    private String id;

    private String fullName;

    private String documentNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Associate)) return false;
        Associate associate = (Associate) o;
        return Objects.equal(getId(), associate.getId()) && Objects.equal(getFullName(), associate.getFullName()) && Objects.equal(getDocumentNumber(), associate.getDocumentNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId(), getFullName(), getDocumentNumber());
    }

    @Override
    public String toString() {
        return "Associate{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                '}';
    }
}
