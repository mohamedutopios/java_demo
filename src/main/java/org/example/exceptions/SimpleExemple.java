package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExemple {

    public static void main() {

        System.out.println("***** division ******");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Donnez moi un nombre : ");
            Integer valeur = scanner.nextInt();
            System.out.println("Donnez moi un diviseur :  ");
            Integer diviseur = scanner.nextInt();
            double resultat = valeur / diviseur;
            System.out.println("Resultat : " + resultat);
        } catch (ArithmeticException | InputMismatchException e) {
            e.printStackTrace();
            SimpleExemple.main();
           /* System.out.println("On ne peut pas diviser par zéro mon copain...");
            System.out.println("Tu recommences...");
            SimpleExemple.main();
        } catch (InputMismatchException e) {
            System.out.println("Tu dois saisir des entiers...");*/
        } catch (Exception e) {
            System.out.println("C'est une exception ...");
        }


    }


}
