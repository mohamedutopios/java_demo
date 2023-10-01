package org.example.designPattern.decorateur;

public class BasicCar implements Car {

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

}
