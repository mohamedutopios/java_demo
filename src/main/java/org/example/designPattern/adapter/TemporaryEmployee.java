package org.example.designPattern.adapter;

public class TemporaryEmployee {
    private String name;
    private double dailyRate;
    private String position;
    public TemporaryEmployee(String name, double dailyRate, String position) {
        this.name = name;
        this.dailyRate = dailyRate;
        this.position = position;
    }
    public String getName() {
        return name;
    }
    public double getDailyRate() {
        return dailyRate;
    }
    public String getPosition() {
        return position;
    }
}

