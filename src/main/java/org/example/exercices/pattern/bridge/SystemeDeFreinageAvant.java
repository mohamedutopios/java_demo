package org.example.exercices.pattern.bridge;

public class SystemeDeFreinageAvant extends SystemeDeFreinage{

    public SystemeDeFreinageAvant(CapteurDeFrein capteurDeFrein) {
        super(capteurDeFrein);
    }
    public void appliquerFrein() {
        int pression = capteurDeFrein.lirePression();
        System.out.println("La pression sur les freins arrière est de " + pression);
    }
}
