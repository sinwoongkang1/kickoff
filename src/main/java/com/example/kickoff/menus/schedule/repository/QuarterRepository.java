package com.example.kickoff.menus.schedule.repository;

import com.example.kickoff.menus.schedule.entity.Quarter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuarterRepository extends JpaRepository<Quarter, Long> {
}
