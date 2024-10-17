package com.example.kickoff.home.controller;

import com.example.kickoff.menus.schedule.entity.Schedule;
import com.example.kickoff.menus.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final ScheduleService scheduleService;

    @GetMapping("/kickoff")
    public String home(Model model) {
        LocalDate currentDate = LocalDate.now();
        List<Schedule> schedules = scheduleService.findNextSchedules(currentDate).stream().limit(3).collect(Collectors.toList());
        model.addAttribute("schedules", schedules);
        return "home";
    }
}
