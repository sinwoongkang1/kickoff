package com.example.kickoff.menus.schedule.controller;

import com.example.kickoff.menus.schedule.entity.Schedule;
import com.example.kickoff.menus.schedule.service.QuarterService;
import com.example.kickoff.menus.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ScheduleController {
    private final ScheduleService scheduleService;
    private final QuarterService quarterService;

    @GetMapping("/menus/schedule")
    public String schedule(Model model) {
        List<Schedule> schedules = scheduleService.getAll();
        model.addAttribute("schedules", schedules);
        return "menus/schedule";
    }
}
