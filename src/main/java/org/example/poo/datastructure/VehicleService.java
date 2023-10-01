package org.example.poo.datastructure;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VehicleService {
    public static void moveVehicle(Vehicle vehicle) {

        if (vehicle instanceof ElectricCar) {
            // get electric engine, get wheels and move wheels
        }

        if (vehicle instanceof PetrolCar) {
            // get petrol engine, get wheels and move wheels
        }

        if (vehicle instanceof MotorCycle) {
            // get motorcycle engine, get two wheels and move wheels
        }
    }

    public static void startVehicleEngine(Vehicle vehicle) {
        if (vehicle instanceof ElectricCar) {
            // get electric engine and start it
        }

        if (vehicle instanceof PetrolCar) {
            // get petrol engine and start it
        }

        if (vehicle instanceof MotorCycle) {
            // get motorcycle's engine and start it
        }
    }




public static void test(){


    ElectricCar electricCar = new ElectricCar(3, "bleue");
    System.out.println(electricCar);
    MotorCycle motorCycle = new MotorCycle();
    motorCycle.setNbreRoue(2);
    motorCycle.setCouleur("vert");

    PetrolCar petrolCar = new PetrolCar();

    petrolCar.setNbreRoue(4);
    petrolCar.setCouleur("gris");

    SuperCar superCar = new SuperCar();

    Engine[] engines = {electricCar, motorCycle,petrolCar};

    System.out.println(Arrays.asList(engines));

    Vehicle[] vehicles = {superCar, electricCar, motorCycle,petrolCar, superCar};

    System.out.println(Arrays.asList(vehicles));



}






}
