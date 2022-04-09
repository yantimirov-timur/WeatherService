package com.example.weatherservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.Date;

public class DataBaseLoader {

    private static final Logger log = LoggerFactory.getLogger(DataBaseLoader.class);

    @Bean
    CommandLineRunner initDB(WeatherHistoryRepository weatherHistoryRepository) {
        Date date = new Date();
        return args -> {
            log.info("Preloading " + weatherHistoryRepository.save(new WeatherHistory(
                    date, "2"
            )));

        };
    }

}
