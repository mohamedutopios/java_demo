package org.example.readFromConsole;


import java.util.Scanner;

public class ReadFromConsole {


    public static void getReadWriteConsole(){

        Scanner  sc = new Scanner(System.in);
        System.out.println("Please, donne moi un mot");
        String mot = sc.next();
        System.out.println("Le mot donné est : " + mot);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Donne moi un nombre mon garçon...");
        int valeur = sc.nextInt();
        System.out.println("Tu m'as donné ce nombre " + valeur);

    }





}
