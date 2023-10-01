package org.example.designPattern.bridge;

public class ConcreteHouse extends House {
    public ConcreteHouse(Construction construction) {
        super(construction);
    }
    public void build() {
        construction.constructFoundation();
        construction.constructWalls();
        construction.constructRoof();
        // Logique de construction spécifique pour une maison en béton
    }
}
