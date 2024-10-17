package com.example.kickoff.menus.schedule.service;

import com.example.kickoff.menus.schedule.entity.Schedule;
import com.example.kickoff.menus.schedule.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ScheduleService {
    private final ScheduleRepository scheduleRepository;

    public Schedule findById(Long id) {
        return scheduleRepository.findById(id).orElse(null);
    }

    public Schedule save(Schedule schedule) {
        return scheduleRepository.save(schedule);
    }

    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }

    public void update(Schedule schedule) {
        scheduleRepository.save(schedule);
    }

    public void deleteById(Long id) {
        Schedule schedule = findById(id);
        scheduleRepository.delete(schedule);
    }

    public List<Schedule> findNextSchedules(LocalDate currentDate) {
        return scheduleRepository.findNextSchedules(currentDate);
    }
}
