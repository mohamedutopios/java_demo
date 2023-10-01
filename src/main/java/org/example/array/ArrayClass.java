package org.example.array;

public class ArrayClass {

    static int[][] matrix = { { 1, 2, 4 }, { 23, 89, 67,89}, { 4, 9 } };

    public static void getArray() {

        int[] tab;
        int tab1[];

        tab = new int[10];

        double[] doubleTab = new double[5];

        int[] tab5 = { 1, 7, 9 };

        System.out.println(tab5[1]);

        System.out.println(matrix[1][0]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // saut de ligne à la fin de chaque ligne du tableau
        }

    }

    public static void getDoubleArray() {

        int[][] tableau = new int[3][4]; // déclaration d'un tableau 3x4

        // Initialisation des valeurs du tableau
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = i * j;
            }
        }

        // Affichage des valeurs du tableau
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println(); // saut de ligne à la fin de chaque ligne du tableau
        }
    }

}
