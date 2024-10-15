package com.example.kickoff.menus.schedule.service;

import com.example.kickoff.menus.schedule.entity.Schedule;
import com.example.kickoff.menus.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public Schedule save(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }
    public void update(Schedule schedule) {
        scheduleRepository.save(schedule);
    }
}
