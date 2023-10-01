package org.example.designPattern.bridge;

public class Main {

    public static void mainHouse() {

        WoodenConstruction woodenConstruction = new WoodenConstruction();
        WoodenHouse woodenHouse = new WoodenHouse(woodenConstruction);
        woodenHouse.build();


    }
}
