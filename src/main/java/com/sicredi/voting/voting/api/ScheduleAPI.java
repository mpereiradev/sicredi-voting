package com.sicredi.voting.voting.api;

import com.sicredi.voting.voting.infra.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/schedule")
public class ScheduleAPI {

    @Autowired
    private ScheduleService scheduleService;
}
