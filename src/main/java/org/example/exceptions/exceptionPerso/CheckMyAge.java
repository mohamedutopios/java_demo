package org.example.exceptions.exceptionPerso;

import javax.naming.directory.SchemaViolationException;
import java.util.Scanner;

public class CheckMyAge {

    public static void main() {

        System.out.println("Quel est votre age ? ");
        Scanner sc = new Scanner(System.in);
        try {
            Integer age = sc.nextInt();
            if (age < 18) {
                throw new MyException("Vous n'êtes pas majeur");
            } else {
                System.out.println("Vous êtes un majeur");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Il y une erreur");
            CheckMyAge.main();
        }


    }


}
