package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // new WeatherReportCore(new WeatherReportFileReader(new WeatherReportFileParser))
        // sout WeatherReportCore.hottestDay()
        // sout WeatherReportCore.coldestDay()

        try(
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                    Objects.requireNonNull(
                            Main.class.getClassLoader().getResourceAsStream("input.txt")
                    )
                )
            )
        ) {
            String line;
            while( (line = reader.readLine()) != null ) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}