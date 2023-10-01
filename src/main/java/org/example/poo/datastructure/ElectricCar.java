package org.example.poo.datastructure;

public class ElectricCar extends Engine implements Vehicle  {


   public ElectricCar() {
        super();
        super.id = Engine.count;

    }

    public ElectricCar(int i, String bleue) {
        super();
    }

    @Override
    public void drive() {
        System.out.println("Electric car drives"
        );
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
        return "ElectricCar{" +
                "id=" + id +
                ", nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
