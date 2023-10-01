package org.example.exercices.pattern.bridge;

public class CapteurDeFreinElectrique implements CapteurDeFrein{
    @Override
    public int lirePression() {
        return 50;
    }
}
