package com.sicredi.voting.voting.infra.repository;

import com.sicredi.voting.voting.domain.Schedule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {
}
