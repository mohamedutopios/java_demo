package org.example.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class DemoThrows {


    public static void main() throws IOException {
            Scanner sc = new Scanner(System.in);
            System.out.println("Saisissez path : ");
            String path = sc.next();
            Files.readAllLines(Paths.get(path));
    }


}
