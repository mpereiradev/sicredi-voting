package com.sicredi.voting.voting.infra.repository;

import com.sicredi.voting.voting.domain.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, String> {
}
