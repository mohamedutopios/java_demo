package org.example.structure;

public class Structure {




    static int montant = 100;
    static int montant1 = 200;


    public static void getIfElse(){

        if(montant> montant1){
            System.out.println("Le montant est supérieur au montant1");
        }else{
            System.out.println("Le montant1 est supérieur au montant");
        }

    }

    public static void getIfElseWithOutBraces(){

        if(montant> montant1)
            System.out.println("Le montant est supérieur au montant1");
        else
            System.out.println("Le montant1 est supérieur au montant");
    }


    public static void getIfElseIfElse(){
        if(montant> montant1)
            System.out.println("Le montant est supérieur au montant1");
        else if (montant> montant1)
            System.out.println("Le montant1 est supérieur au montant");
        else if (montant == montant1)
            System.out.println("Le montant1 est egal au montant");
        else
            System.out.println("Impossible");
    }


    public static void getSwitch(){

        String val = "toto";

        switch (val){
            case "titi":
                System.out.println("c'est titi");
                break;
            case "tata":
                System.out.println("c'est tata");
                break;
            case "tutu":
                System.out.println("c'est tutu");
                break;
            default:
                System.out.println("Aucun");
        }
    }






}
