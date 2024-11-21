package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeatherReportFileParser {
    private WeatherDay parseLine(String line) {
        String[] args = line.split(" {2}");

        LocalDate date = LocalDate.parse(args[0]);
        int temperature = Integer.parseInt(args[1]);

        return new WeatherDay(date, temperature);
    }

    public List<WeatherDay> parseFile(List<String> lines) {
        List<WeatherDay> weatherDays = new ArrayList<>();

        lines.forEach(
                line -> weatherDays.add(parseLine(line))
        );

        return weatherDays;
    }
}
