package org.example;

import java.util.Comparator;

public class WeatherComparator implements Comparator<WeatherDay> {

    @Override
    public int compare(WeatherDay weatherDay1, WeatherDay weatherDay2) {
        return Integer.compare(weatherDay1.getTemperature(), weatherDay2.getTemperature());
    }
}
