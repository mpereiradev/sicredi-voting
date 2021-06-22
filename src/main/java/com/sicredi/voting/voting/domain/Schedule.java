package com.sicredi.voting.voting.domain;

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
}
