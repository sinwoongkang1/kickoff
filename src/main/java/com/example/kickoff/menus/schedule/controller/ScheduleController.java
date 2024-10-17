package com.example.kickoff.menus.schedule.controller;

import com.example.kickoff.menus.schedule.entity.Schedule;
import com.example.kickoff.menus.schedule.service.QuarterService;
import com.example.kickoff.menus.schedule.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        return "menus/schedule/viewSchedule";
    }
    @GetMapping("/makeSchedule")
    public String makeSchedule() {
        return "menus/schedule/makeSchedule";
    }
    @PostMapping("/addSchedule")
    public String addSchedule(@ModelAttribute Schedule schedule) {
        Schedule newSchedule = new Schedule();
        newSchedule.setPlayingDate(schedule.getPlayingDate());
        newSchedule.setStartTime(schedule.getStartTime());
        newSchedule.setMatchPlace(schedule.getMatchPlace());
        newSchedule.setMatchName(schedule.getMatchName());
        scheduleService.save(newSchedule);
        return "redirect:/menus/schedule";
    }
    @GetMapping("/schedule/{id}")
    public String schedule(@PathVariable long id, Model model) {
        Schedule schedule = scheduleService.findById(id);
        model.addAttribute("schedule", schedule);
        return "menus/schedule/scheduleDetails";
    }
    @GetMapping("/scheduleEdit/{id}")
    public String scheduleEdit(@PathVariable long id, Model model) {
        Schedule schedule = scheduleService.findById(id);
        model.addAttribute("schedule", schedule);
        return "menus/schedule/scheduleEdit";
    }
    @PostMapping("/scheduleEdit/{id}")
    public String updateScheduleEdit(@PathVariable long id, @ModelAttribute Schedule schedule) {
        Schedule findSchedule = scheduleService.findById(id);
        findSchedule.setRound(schedule.getRound());
        findSchedule.setPlayingDate(schedule.getPlayingDate());
        findSchedule.setStartTime(schedule.getStartTime());
        findSchedule.setMatchPlace(schedule.getMatchPlace());
        findSchedule.setMatchName(schedule.getMatchName());
        scheduleService.update(findSchedule);

        return "menus/schedule/scheduleDetails";
    }
}
