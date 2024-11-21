package org.example;

public class WeatherReportCore {
    private final WeatherReportAnalyzer weatherReportAnalyzer;
    private static WeatherReportCore instance;


    private WeatherReportCore(WeatherReportFileReader weatherReportFileReader) {
        this.weatherReportAnalyzer = new WeatherReportAnalyzer(weatherReportFileReader.getWeatherReportData());
    }

    public static synchronized WeatherReportCore getInstance(WeatherReportFileReader weatherReportFileReader) {
        if (instance == null) {
            instance = new WeatherReportCore(weatherReportFileReader);
        }
        return instance;
    }

    public WeatherDay getHottestDay() {
        return weatherReportAnalyzer.getHottestDay();
    }

    public WeatherDay getCoolestDay() {
        return weatherReportAnalyzer.getCoolestDay();
    }


}
