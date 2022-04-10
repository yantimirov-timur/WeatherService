package com.example.weatherservice;

import com.example.parser.WebParser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class WeatherHistoryController {
    private final WeatherHistoryRepository weatherHistoryRepository;

    WeatherHistoryController(WeatherHistoryRepository weatherHistoryRepository) {
        this.weatherHistoryRepository = weatherHistoryRepository;
    }

    @GetMapping("/weather")
    List<WeatherHistory> all() throws IOException {
        List<WeatherHistory> weatherHistories = weatherHistoryRepository.findAll();

        if (weatherHistories.isEmpty()) {
            WebParser parser = new WebParser();
            Date currentDate = new Date();
            WeatherHistory history = new WeatherHistory(currentDate, parser.parse().toString());
            weatherHistoryRepository.save(history);
            weatherHistories = weatherHistoryRepository.findAll();
        }
        return weatherHistories;
    }
}
