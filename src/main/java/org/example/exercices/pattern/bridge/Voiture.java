package org.example.exercices.pattern.bridge;

public class Voiture {

        public static void main() {

            CapteurDeFrein capteurDeFreinAvant = new CapteurDeFreinHydraulique();
            SystemeDeFreinage systemeDeFreinageAvant = new SystemeDeFreinageAvant(capteurDeFreinAvant);
            systemeDeFreinageAvant.appliquerFrein();

            CapteurDeFrein capteurDeFreinArriere = new CapteurDeFreinElectrique();
            SystemeDeFreinage systemeDeFreinageArriere = new SystemeDeFreinageArriere(capteurDeFreinArriere);
            systemeDeFreinageArriere.appliquerFrein();
        }
}
