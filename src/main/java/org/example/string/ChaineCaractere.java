package org.example.string;

import java.util.Arrays;


public class ChaineCaractere {

    ChaineCaractere ch = new ChaineCaractere();
    ChaineCaractere ch2 = new ChaineCaractere();


    public static void getMethodString() {

        System.out.println(" ----- Les chaines de caractère ------ ");
        System.out.println();

        String s = " hello ";

        System.out.println("s.length() " + s.length()); // 7
        System.out.println("s.contains(\"he\") " + s.contains("he")); // true
        System.out.println("s.isEmpty : " + s.isEmpty());
        System.out.println("s.toUppercase " + s.toUpperCase()); // HELLO
        System.out.println("s.startsWith(\"h\") " + s.startsWith("h"));
        System.out.println("s.endsWith(\" \") " + s.endsWith(" "));

        System.out.println("s.replace(\"ll\", \"LL\")" + s.replace("ll", "LL")); // heLLo
        System.out.println("s.trim() " + s.trim()); //hello
        System.out.println("s.substring(0,3) : " + s.substring(0, 3));

        System.out.println("Arrays.toString(s.getBytes()) : " + Arrays.toString(s.getBytes()));
        System.out.println("Arrays.toString(s.toCharArray()) : " + Arrays.toString(s.toCharArray()));
        System.out.println("s.charAt(1) : " + s.charAt(1));
        System.out.println("Arrays.toString(s.split(\"e\")) : " + Arrays.toString(s.split("e"))); // [h,llo]
        System.out.println(s); // hello

    }


    public static void getComparaisonString() {
        System.out.println("----- Comparaison String -----");
        System.out.println();

        String s = " hello ";
        String s2 = " hello ";

        System.out.println(" s == s2 " + s == s2); // true

        String s3 = new String(" hello ");

        System.out.println(" s == s3 " + s == s3); // false

        System.out.println("s.equals(s3) " + s.equals(s3)); //true

        String firstName = "Abdallah";
        String firstName1 = "abdallah";

        System.out.println("firstName.equals(firstName1) " + firstName.equals(firstName1)); // false
        System.out.println("firstName.equalsIgnoreCase(firstName1) " + firstName.equalsIgnoreCase(firstName1)); // true


    }


    public static void getFormatting() {

        System.out.println("----- Formattage String -----");
        System.out.println();

        String firstName = "Abdallah";

        String phrase = "Salut, cher %s! , Good %s!";

        String morning = "Morning";
        String evening = "Evening";
        String afternoon = "Afternoon";

        String nouvellePhrase = String.format(phrase, firstName, morning);
        System.out.println(nouvellePhrase);

        System.out.printf("Vous allez gagner %d à l'euro-millions dans %d jours", 10000, 10);

    }


}
