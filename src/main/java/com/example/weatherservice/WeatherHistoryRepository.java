package com.example.weatherservice;

import org.springframework.data.jpa.repository.JpaRepository;


public interface WeatherHistoryRepository extends JpaRepository<WeatherHistory, Integer> { }
