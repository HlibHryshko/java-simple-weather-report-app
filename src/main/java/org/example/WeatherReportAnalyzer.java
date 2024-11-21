package org.example;

import java.util.List;

public class WeatherReportAnalyzer {
    private final List<WeatherDay> weatherData;

    public WeatherReportAnalyzer(List<WeatherDay> weatherData) {
        this.weatherData = weatherData;
    }

    public WeatherDay getHottestDay() {
        return weatherData.stream().max(new WeatherComparator()).get();
    }

    public WeatherDay getCoolestDay() {
        return weatherData.stream().min(new WeatherComparator()).get();
    }
}
