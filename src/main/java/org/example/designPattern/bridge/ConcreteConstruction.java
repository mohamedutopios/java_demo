package org.example.designPattern.bridge;

public class ConcreteConstruction implements Construction {
    public void constructFoundation() {
        System.out.println("La House est en beton");
    }
    public void constructWalls() {
        System.out.println("Les murs sont en betons");
    }
    public void constructRoof() {
        System.out.println("Le toit est en tuile");
    }
}

