package com.sicredi.voting.voting.domain.response;

import com.sicredi.voting.voting.domain.Schedule;
import com.sicredi.voting.voting.domain.mapper.ScheduleMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleResponseTest {

    @Mock
    ScheduleMapper scheduleMapper;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void whenScheduleComplete() {
        Schedule schedule = new Schedule();
        schedule.setId("1ABC");
        schedule.setDescription("Schedule for test");

        ScheduleResponse scheduleResponse = scheduleMapper.scheduleToScheduleResponse(schedule);
        assertEquals("1ABC", scheduleResponse.getId());
    }
}