package com.mackey.weather.spring.Models;

import jakarta.persistence.*;
import java.sql.Time;

@Entity
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String city;
    @Column
    private int temperature;
    @Column
    private Time time;
    @Column
    private String forecast;

    public long getId() {return id;}
    public String getCity() {return city;}
    public int getTemperature() {return temperature;}
    public Time getTime() {return time;}
    public String getForecast() {return forecast;}
    public void setId(long id) {this.id = id;}
    public void setCity(String city) {this.city = city;}
    public void setTemperature(int temperature) {this.temperature = temperature;}
    public void setTime(Time time) {this.time = time;}
    public void setForecast(String forecast) {this.forecast = forecast;}
}