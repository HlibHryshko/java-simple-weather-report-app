package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        WeatherReportCore weatherReportCore = new WeatherReportCore(
                new WeatherReportFileReader("input.txt", new WeatherReportFileParser())
        );

        System.out.println(weatherReportCore.getHottestDay().loggingRepresentation());
        System.out.println(weatherReportCore.getCoolestDay().loggingRepresentation());
    }
}