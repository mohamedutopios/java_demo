package org.example.files.objectStream;

import java.io.*;
import java.util.Date;

public class ObjectStreamWrite {


    private static String path = "C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\objectStream\\employee.data";


    public static void main() throws IOException {

        File file = new File(path);

        Employee e1 = new Employee("Tom",1000f);
        Employee e2 = new Employee("Tim",1500f);
        Employee e3 = new Employee("Abdallah",900f);

        Employee[] employees = new Employee[]{e1,e2,e3};

        OutputStream outputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        System.out.println("Fichier origine : " + file.getAbsolutePath());

        objectOutputStream.writeObject(new Date());
        objectOutputStream.writeUTF("Liste des employees : ");

        objectOutputStream.writeInt(employees.length);

        for (Employee e : employees){
            objectOutputStream.writeObject(e);
        }

        objectOutputStream.close();

        System.out.println("C'est fini l'ecriture ... ");


    }





}
