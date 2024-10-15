package com.example.kickoff.menus.schedule.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Quarter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String matchName;
    private Integer quarter;
    private Integer scored;
    private Integer conceded;
    private Integer assists;
    private Integer clean;
    //user - many to many
    //quarter - many to many
}
