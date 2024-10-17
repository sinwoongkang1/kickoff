package com.example.kickoff.menus.schedule.repository;

import com.example.kickoff.menus.schedule.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    @Query("SELECT s FROM Schedule s WHERE s.playingDate >= :currentDate ORDER BY s.playingDate ASC")
    List<Schedule> findNextSchedules(@Param("currentDate") LocalDate currentDate);

}
