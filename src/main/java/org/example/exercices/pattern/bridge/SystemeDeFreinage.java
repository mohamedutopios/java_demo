package org.example.exercices.pattern.bridge;

public abstract class SystemeDeFreinage {

    protected CapteurDeFrein capteurDeFrein;
    public SystemeDeFreinage(CapteurDeFrein capteurDeFrein) {
        this.capteurDeFrein = capteurDeFrein;
    }
    public abstract void appliquerFrein();
}
