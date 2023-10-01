package org.example.exercices.pattern.bridge;

public class SystemeDeFreinageArriere extends SystemeDeFreinage{


    public SystemeDeFreinageArriere(CapteurDeFrein capteurDeFrein) {
        super(capteurDeFrein);
    }

    public void appliquerFrein() {
        int pression = capteurDeFrein.lirePression();

        System.out.println("La pression sur les freins avant est de " + pression);

    }
}
