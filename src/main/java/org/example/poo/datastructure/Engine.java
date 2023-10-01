package org.example.poo.datastructure;

public abstract class Engine {

    protected static int count;
    protected int id;


    protected int nbreRoue;

    protected String couleur;


    {
        ++count;

    }

    public int getNbreRoue() {
        return nbreRoue;
    }

    public abstract int demo();


    public void setNbreRoue(int nbreRoue) {
        this.nbreRoue = nbreRoue;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "nbreRoue=" + nbreRoue +
                ", couleur='" + couleur + '\'' +
                '}';
    }
}
