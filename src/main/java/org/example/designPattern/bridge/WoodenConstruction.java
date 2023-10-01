package org.example.designPattern.bridge;

public class WoodenConstruction implements Construction {
    public void constructFoundation() {
        System.out.println("La House est en bois");
    }
    public void constructWalls() {
        System.out.println("Les murs sont en bois");
    }
    public void constructRoof() {
        System.out.println("Le toit est en bois");
    }
}

