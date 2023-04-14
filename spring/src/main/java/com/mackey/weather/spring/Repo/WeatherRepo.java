package com.mackey.weather.spring.Repo;

import com.mackey.weather.spring.Models.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WeatherRepo extends JpaRepository<Weather, Long> {
        List<Weather> findByCity(String city);
    }



