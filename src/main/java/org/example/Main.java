package org.example;

public class Main {
    public static void main(String[] args) {

        WeatherReportCore weatherReportCore = WeatherReportCore.getInstance(
                new WeatherReportFileReader("input.txt", new WeatherReportFileParser())
        );

        System.out.println(weatherReportCore.getHottestDay().loggingRepresentation());
        System.out.println(weatherReportCore.getCoolestDay().loggingRepresentation());
    }
}