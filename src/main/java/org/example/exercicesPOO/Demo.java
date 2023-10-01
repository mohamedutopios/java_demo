package org.example.exercicesPOO;

public class Demo {
    public static void main() {

        CompteSimple simple = new CompteSimple(1000, 100);
        System.out.println(simple);
        simple.retrait(1200);
        simple.depot(100);
        simple.retrait(1200);
        System.out.println(simple);

        CompteEpargne epargne = new CompteEpargne(1000, 1.5);
        System.out.println(epargne);
        epargne.calculInteret(3);
        System.out.println(epargne);

        ComptePayant payant = new ComptePayant(1000);
        System.out.println(payant);
        payant.depot(100);
        payant.retrait(150);
        System.out.println(payant);
    }
}
