package com.example.weatherservice;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "weather_history")
public class WeatherHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date weather_date;
    private String weather_value;

    public WeatherHistory(Date weather_date, String weather_value) {
        this.weather_date = weather_date;
        this.weather_value = weather_value;
    }

    public WeatherHistory() {
    }

    public Integer getId() {
        return id;
    }

    public Date getWeather_date() {
        return weather_date;
    }

    public String getWeather_value() {
        return weather_value;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setWeather_date(Date weather_date) {
        this.weather_date = weather_date;
    }

    public void setWeather_value(String weather_value) {
        this.weather_value = weather_value;
    }

    @Override
    public String toString() {
        return "WeatherHistory{" +
                "id=" + id +
                ", weather_date=" + weather_date +
                ", weather_value='" + weather_value + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherHistory that = (WeatherHistory) o;
        return Objects.equals(id, that.id) && Objects.equals(weather_date, that.weather_date) && Objects.equals(weather_value, that.weather_value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weather_date, weather_value);
    }
}
