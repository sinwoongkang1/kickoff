package com.example.kickoff.menus.schedule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String matchName;
    private String matchPlace;
    private LocalDate playingDate;
    private LocalTime startTime;
    private LocalDate endDate;
    private String resultWin;
    private String resultDraw;
    private String resultLose;
    //List<player> - many to many
    //List<quarter> - many to many

}
