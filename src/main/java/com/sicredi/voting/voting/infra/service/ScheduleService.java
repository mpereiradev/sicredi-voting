package com.sicredi.voting.voting.infra.service;

import com.sicredi.voting.voting.domain.Schedule;
import com.sicredi.voting.voting.infra.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Executable;

@Service
public class ScheduleService {

    @Autowired
    private ScheduleRepository scheduleRepository;

    public void saveSchedule(Schedule schedule) {
        try {
            scheduleRepository.save(schedule);
        } catch (Exception e) {

        }
    }
}
