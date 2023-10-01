package org.example.designPattern.observer;

public class ObserverDemo {
    public static void main() {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        CurrentConditionsDisplay currentDisplay2 = new CurrentConditionsDisplay();
        weatherData.addObserver(currentDisplay);
        weatherData.addObserver(currentDisplay2);
        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("Changement");
        weatherData.setMeasurements(90, 70, 10.4f);

    }
}
