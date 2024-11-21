package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WeatherReportFileReader {
    private final String fileName;
    private final WeatherReportFileParser weatherReportFileParser;

    public WeatherReportFileReader(String fileName, WeatherReportFileParser weatherReportFileParser) {
        this.fileName = fileName;
        this.weatherReportFileParser = weatherReportFileParser;
    }

    public List<WeatherDay> getWeatherReportData() {
        return weatherReportFileParser.parseFile(readFile());
    }

    private List<String> readFile() {
        List<String> lines = new ArrayList<>();

        try(
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                Objects.requireNonNull(
                                        WeatherReportFileReader.class.getClassLoader().getResourceAsStream(fileName)
                                )
                        )
                )
        ) {
            String line;
            while( (line = reader.readLine()) != null ) {
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lines;
    }
}
