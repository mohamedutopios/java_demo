package org.example.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DemoFile {

    public static void main() throws IOException {

        File file = new File("C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\file.txt");

        FileReader fr = new FileReader(file);

        File file2 = new File("C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\file2.txt");

        FileWriter fileWriter = new FileWriter(file2);

        int c = 0;

        while ((c = fr.read()) != -1) {
            fileWriter.write(c);
        }

        fr.close();
        fileWriter.close();

    }

    public static void main2() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\file3.txt"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main3() {
        try {
            List<String> allLines = Files.readAllLines(Paths.get("C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\file3.txt"));
            for (String line : allLines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
