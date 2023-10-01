package org.example.designPattern.singleton;

public class Singleton {
    // l'unique instance de la classe Singleton
    private static Singleton instance;

    // un constructeur privé pour empêcher l'instanciation directe de la classe
    private Singleton() {}

    // une méthode publique qui permet d'obtenir l'instance unique de la classe Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // méthodes de la classe
    public void doSomething() {
        // ...
    }
}

