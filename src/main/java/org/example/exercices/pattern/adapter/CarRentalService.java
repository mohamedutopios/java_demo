package org.example.exercices.pattern.adapter;

import org.example.exercices.pattern.adapter.Car;
import org.example.exercices.pattern.adapter.CarDataAdapter;

public class CarRentalService {

    public static void main() {
        CarData carData = new CarData("Ford", "Mustang", "2021", "Red", 50.0);
        Car car = (Car) new CarDataAdapter(carData);
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Color: " + car.getColor());
        System.out.println("Price: " + car.getPrice());
    }
}
