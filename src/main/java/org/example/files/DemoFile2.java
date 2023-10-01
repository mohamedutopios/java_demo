package org.example.files;

import java.io.File;
import java.util.Scanner;

public class DemoFile2 {

    private static String path1 = "C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\dossier";

    public static void main() {

        File file = new File(path1);

      /*  if (file.exists()) {
            System.out.println("Directory " + file.isDirectory());
            System.out.println("File name " + file.getName());
            System.out.println("Absolute Path " + file.getAbsolutePath());
            System.out.println("Writable " + file.canWrite());
            System.out.println("Readable " + file.canRead());
            System.out.println("Size of file en bytes " + file.length());
        } else {
            System.out.println("File n'existe pas");
        }

        for (File f : file.listFiles()) {
            System.out.println(f.getName());
        }*/

      //  checkFile(file);

        System.out.println("Quel est le nom du fichier");

        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();


        System.out.println("Quel est le texte que vous insérer ? ");
        String texte = sc.nextLine();







    }

    public static void checkFile(File file) {
        for (File f : file.listFiles()) {
            if (f.isFile()) {
                System.out.println("File : " + f.getParentFile().getName() + " " + f.getName() + " " + f.length());
            } else {
                System.out.println("Directory : " + f.getParentFile().getName() +" "+ f.getName() + " " + f.length());
                checkFile(f);
            }
        }
    }





}
