package com.example.weatherservice;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WeatherHistoryRepository extends JpaRepository<WeatherHistory, Integer> {

}
