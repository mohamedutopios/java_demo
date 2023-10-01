package org.example.variable;

public class Variable {

    public static void getVariable() {

        byte b = 'A';

        b =127; // => ok
        b = -128; // => ok
       // b = 130; // => ko
        short s;
        s = 2;
        int i = 3;
        long l = 4;
        System.out.println(i);
        char c = 'c';
        boolean bool = true;

        float f = 1.2F;

        long l2 = 200000000000L;

        double d = 1.3;

        // Quelques tests :

        // Possible si on cast le byte, le byte est plus petit mais pas du même type.
        char t = (char) b;

        // un entier de type int peut prendre une variable avec un type numérique plus petit comme ici un short
        i = s;
        int i3 = s;
        // un byte ne peut pas prendre un short car short est trop grand.
        //b = s;

        //1 - Exemple sur les char :
        char c2 = 100;
        c2 = 'A';
        System.out.println(c2);
       // c2 = 'AA'; // => plutôt une chaîne de caractère.
        char c3 = 290; // => cela marche mais que positive
        char c4 = (char) 69000; // => supérieur à 65535, il va y avoir un cast.
        System.out.println("c4 : " + c4);


        // test

        System.out.println("i3 avant modif : " + i3 );
        double d2 = i3;
        System.out.println("d2 avant modif : " + d2 );
        d2 = l;
        System.out.println("d2 apres modif : " + d2 );

        // Quand on caste, il y a une perte de valeur (on prend les premiers bits).
        i3 = 654332118;
        System.out.println("i3 : " + i3);
        b = (byte) i3;
        System.out.println("b après cast : " + b);

        //Lorsque vous effectuez la conversion (byte) 128, vous obtenez -128 en raison du fonctionnement
        // de la représentation des nombres binaires
        // en complément à deux pour les types de données signés en Java, tels que byte.
        byte b2 = (byte) 128;
        System.out.println("b2 " + b2);

        long number = 499_999_999_654_000_001L;
        double converted = (double) number;
        System.out.println("converted " + converted);
        double addition = converted + number;
        System.out.println("addition " + addition);
        int castage = (int) addition;
        System.out.println("castage " + castage);

    }

}
