package org.example;

import java.time.LocalDate;

public class WeatherDay {
    private final LocalDate date;
    private final int temperature;

    public WeatherDay(LocalDate date, int temperature) {
        this.date = date;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public String loggingRepresentation() {
        return "On " + date.toString() + " the temperature was " + temperature + " degrees Celsius.";
    }
}
