package org.example.files.dataStream;

import java.io.*;

public class DataStreamRead {

    private static final String filePath = "C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\dataStream\\fichier.txt";

    public static void main() throws IOException {

        File file = new File(filePath);

        InputStream inputStream = new FileInputStream(file);

        DataInputStream dataInputStream = new DataInputStream(inputStream);

        System.out.printf("|%3s | %10s | %10s | %8s | %8s| %10s | %10s |%n", //
                "No", "Order Date", "Finished?", "Item", "Units", "Unit Cost", "Total");

        System.out.printf("|%3s | %10s | %10s | %8s | %8s| %10s | %10s |%n", //
                "--", "---------", "----------", "----------", "------", "---------", "---------");

        int row = 0;

        while (dataInputStream.available() > 0) {
            ++row;
            String item = dataInputStream.readUTF();
            boolean finished = dataInputStream.readBoolean();
            float unitCost = dataInputStream.readFloat();
            float total = dataInputStream.readFloat();
            int units = dataInputStream.readInt();
            String orderDate = dataInputStream.readUTF();


            System.out.printf("|%3d | %10s | %10b | %8s | %8d| %,10.2f | %,10.2f |%n"
                    , row, orderDate, finished, item, units, unitCost, total);

        }
        dataInputStream.close();
    }


}
