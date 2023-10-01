package org.example.files.fileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamd {

    public static void main() throws IOException {


        String path = "C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\fileInputStream\\utf8-file.txt";

        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);

        int code;
        while ((code = fileInputStream.read()) != -1) {
            char ch = (char) code;
            System.out.println(code + " " + ch);
        }
        fileInputStream.close();

    }


}
