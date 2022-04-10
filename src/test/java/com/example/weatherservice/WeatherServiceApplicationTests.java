package com.example.weatherservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;


import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class WeatherServiceApplicationTests {

    @LocalServerPort
    private int port;

    @Autowired
    private WeatherHistoryController controller;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void isNullTest() {
        assertThat(controller).isNotNull();
    }

    @Test
    void checkDate() {
        Date utilDate = new java.util.Date();
        Date sqlDate = new java.sql.Date(utilDate.getTime());
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/weather",
                String.class)).contains(sqlDate.toString());
    }


}
