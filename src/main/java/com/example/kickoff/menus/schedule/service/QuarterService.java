package com.example.kickoff.menus.schedule.service;

import com.example.kickoff.menus.schedule.entity.Quarter;
import com.example.kickoff.menus.schedule.repository.QuarterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QuarterService {
    private final QuarterRepository quarterRepository;

    public void save(Quarter quarter) {
        quarterRepository.save(quarter);
    }
}
