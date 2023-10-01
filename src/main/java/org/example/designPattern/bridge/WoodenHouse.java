package org.example.designPattern.bridge;

public class WoodenHouse extends House {
    public WoodenHouse(Construction construction) {
        super(construction);
    }
    public void build() {
        construction.constructFoundation();
        construction.constructWalls();
        construction.constructRoof();
        // Logique de construction spécifique pour une maison en bois
    }
}
