package com.example.kickoff.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Boolean executive;
    private String username;
    private String email;
    private String password;
    private String firstFormation;
    private String secondFormation;
    private Integer goals;
    private Integer assists;
    private Integer cleans;
    private Boolean late;
    private Boolean attend;
    //private List<Schedule> schedules;
}
