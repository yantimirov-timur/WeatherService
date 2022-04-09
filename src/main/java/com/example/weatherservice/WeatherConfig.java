package com.example.weatherservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


public class WeatherConfig {
//    @Bean
//    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//        dataSource.setUrl("postgres://yuniylxryjumpo:023a46c99ebfbb7696c1bd752d902d65bd989b6ae3f2bd13afffcc023aa22a1c@ec2-63-35-156-160.eu-west-1.compute.amazonaws.com:5432/d7golk518goad7");
//        dataSource.setUsername("spring.datasource.username=yuniylxryjumpo");
//        dataSource.setPassword("023a46c99ebfbb7696c1bd752d902d65bd989b6ae3f2bd13afffcc023aa22a1c");
//        return dataSource;
//    }
}
