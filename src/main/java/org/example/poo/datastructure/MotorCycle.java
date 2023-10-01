package org.example.poo.datastructure;

public class MotorCycle extends Engine implements Vehicle{


    public MotorCycle(){
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

    @Override
    public String toString() {
        return "MotorCycle{" +
                "id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
