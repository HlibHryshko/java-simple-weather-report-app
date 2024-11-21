package org.example;

    /*
   TODO:
   make it a singleton
    */

public class WeatherReportCore {
    private final WeatherReportAnalyzer weatherReportAnalyzer;

    public WeatherReportCore(WeatherReportFileReader weatherReportFileReader) {
        this.weatherReportAnalyzer = new WeatherReportAnalyzer(weatherReportFileReader.getWeatherReportData());
    }

    public WeatherDay getHottestDay() {
        return weatherReportAnalyzer.getHottestDay();
    }

    public WeatherDay getCoolestDay() {
        return weatherReportAnalyzer.getCoolestDay();
    }


}
