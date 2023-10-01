package org.example.exercices.pattern.bridge;

public class CapteurDeFreinHydraulique implements CapteurDeFrein{
    @Override
    public int lirePression() {
        return 200;
    }
}
