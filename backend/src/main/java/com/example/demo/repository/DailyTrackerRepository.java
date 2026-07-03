package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DailyTracker;

public interface DailyTrackerRepository extends JpaRepository<DailyTracker, Long> {

}