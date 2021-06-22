package com.sicredi.voting.voting.domain.mapper;

import com.sicredi.voting.voting.domain.Schedule;
import com.sicredi.voting.voting.domain.request.ScheduleRequest;
import com.sicredi.voting.voting.domain.response.ScheduleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ScheduleMapper {

//    Schedule scheduleRequestToSchedule(ScheduleRequest scheduleRequest);

    @Mapping(source = "id", target = "id")
    ScheduleResponse scheduleToScheduleResponse(Schedule schedule);
}
