package com.mackey.weather.spring.Controller;

import com.mackey.weather.spring.Models.Weather;
import com.mackey.weather.spring.Repo.WeatherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ApiController {

    @Autowired
    private WeatherRepo weatherRepo;
    @GetMapping(value = "/")
    public String getPage() {
        return "Welcome to my Hourly Weather Report";
    }
    @GetMapping(value = "/weather")
    public List<Weather> getWeather() {
        return weatherRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveUser(@RequestBody Weather weather) {
        weatherRepo.save(weather);
        return "The hourly weather report has been saved!";
    }
    @GetMapping(value = "/weather/{city}")
    public List<Weather> getWeatherByCity(@PathVariable String city) {
        return weatherRepo.findByCity(city);
    }

    @PutMapping(value = "update/{id}")
    public String updateUser(@PathVariable long id, @RequestBody Weather weather) {
        Weather updatedWeather = weatherRepo.findById(id).get();
        updatedWeather.setCity(weather.getCity());
        updatedWeather.setTemperature(weather.getTemperature());
        updatedWeather.setTime(weather.getTime());
        updatedWeather.setForecast(weather.getForecast());
        weatherRepo.save(updatedWeather);
        return "The hourly weather report has been updated!";
    }
    @DeleteMapping(value = "/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        Weather deleteWeather = weatherRepo.findById(id).get();
        weatherRepo.delete(deleteWeather);
        return "The hourly weather report id has been deleted with the id: " + id;
    }
}
