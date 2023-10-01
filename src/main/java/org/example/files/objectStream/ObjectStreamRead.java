package org.example.files.objectStream;

import java.io.*;
import java.util.Date;

public class ObjectStreamRead {


    private static String path = "C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\objectStream\\employee.data";


    public static void main() throws IOException, ClassNotFoundException {


        File file = new File(path);

        InputStream is = new FileInputStream(file);

        ObjectInputStream objectInputStream = new ObjectInputStream(is);


        System.out.println("Le fichier que je vais lire : " + file.getAbsolutePath());

        System.out.println();

        Date date = (Date) objectInputStream.readObject();
        String info = objectInputStream.readUTF();

        System.out.println(date);
        System.out.println(info);
        System.out.println();

        int countEmployee = objectInputStream.readInt();

        System.out.println("Le nombre d'employe : " + countEmployee);

        for (int i = 0; i < countEmployee; i++) {

            Employee e = (Employee) objectInputStream.readObject();
            System.out.println("Employe Name : " + e.getFullName() + " / salaire : " + e.getSalary());

        }
        objectInputStream.close();


    }




}
