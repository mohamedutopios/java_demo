package org.example.poo.datastructure;

public class PetrolCar extends Engine implements Vehicle{


    public PetrolCar() {

        id = Engine.count;

    }

    @Override
    public void drive() {
        System.out.println("Petrol car drives");
    }

    @Override
    public void startEngine() {
        System.out.println("Engine is started");
    }


    @Override
    public int demo() {
        return 0;
    }
}
