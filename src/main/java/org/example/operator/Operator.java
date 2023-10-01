package org.example.operator;

import com.sun.jdi.IntegerType;
import org.example.model.Maison;

import java.util.Arrays;

public class Operator {




    public static void getOpertors(){

        System.out.println(" --- Les operateurs ---");

        int i = 10;
        int i2 = -10;
        int i3 = ++i;
        int i4 = i++;
        int i5 = --i;
        int i6 = i--;

        System.out.println("i : " + i); //10
        System.out.println("i2 : " + i2); //-10
        System.out.println("i3 : " + i3); //11
        System.out.println("i4 : " + i4); //
        System.out.println("i5 : " + i5);
        System.out.println("i6 : " + i6);

    }


    public static void getExpressionType(){

        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1;

        float f = 1.0F;
        double d = 1.0;

        char c = 1;

        int express1 = b + b;
        int express2 = s + b;
        int express3 = b + i + c;

        long express4 = i + l;

        float express5 = l + f;

        double express6 = f + d;

        // Si on tente de mettre un long dans un entier, c'est pas possible :
        // int express7 = express4 + express5;

        // La somme de 2 entiers importants donne un entier négatifs :

        int t = 2_000_887_697;
        int t2 = 2_000_887_697;

        int lo = t + t2;

        //
        // int lou = 'A' + 4;



        System.out.println(lo);


    }


    public static void getOperationAndComparaisonType(){

        int int1 = 128;
        int int2 = 128;


        System.out.println("int1 == int2 " + (int1 == int2));

        // https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html

        System.out.println("65 == A " + (65 == 'A'));

        Integer i = 128;
        Integer i2 = 128;

        System.out.println("i == i2 " + (i == i2)); // false

        int i8 = 128;
        int i9 = 128;

        System.out.println("i8 == i9 " + (i8 == i9));

        Integer i3 = 127;
        Integer i4 = 127;

        System.out.println("i3 == i4 " + (i3 == i4)); // true

        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);

        System.out.println("i5 == i6 " + (i5 == i6)); // false

        Integer i7 = Integer.valueOf(127);
        Integer i11 = Integer.valueOf(127);

        System.out.println("i7 == i8 " + (i7 == i11)); // true

        System.out.println("i == i2 " + (i.equals(i2))); // true

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println("arr1 == arr2 " + (arr1 == arr2)); // false
        System.out.println("arr1.equals(arr2) " + (arr1.equals(arr2))); // false
        System.out.println("Arrays.equals(arr1, arr2)" + Arrays.equals(arr1, arr2)); // true

        arr1 = arr2;

        System.out.println("arr1 == arr2 " + (arr1 == arr2)); // true


        Maison maison1 = new Maison(12, "maison1");
        Maison maison2 = new Maison(12, "maison1");

        System.out.println("maison1 == maison2 " + (maison1 == maison2)); // false

        System.out.println("maison1.nom == maison2.nom " + (maison1.nom == maison2.nom)); //true


    }




}
