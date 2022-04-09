package com.example.weatherservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WeatherHistoryController {


    private final WeatherHistoryRepository weatherHistoryRepository;

    WeatherHistoryController(WeatherHistoryRepository weatherHistoryRepository) {
        this.weatherHistoryRepository = weatherHistoryRepository;
    }

    @GetMapping("/weather")
    List<WeatherHistory> all() {
        return weatherHistoryRepository.findAll();
    }
}
