package com.example.kickoff.menus.schedule.controller;

import com.example.kickoff.menus.schedule.service.QuarterService;
import com.example.kickoff.menus.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;
    private final QuarterService quarterService;

    @GetMapping("/menus/schedule")
    public String schedule() {
        return "menus/schedule";
    }
}
