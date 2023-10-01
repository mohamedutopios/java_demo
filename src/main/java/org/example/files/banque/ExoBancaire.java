package org.example.files.banque;

import java.io.*;

public class ExoBancaire {

    public static void main() throws IOException {

        File file = new File("C:\\Users\\User1\\Documents\\Java\\demo-app2\\src\\main\\java\\org\\example\\files\\banque\\file_bancaire.txt");

        FileReader fileReader = new FileReader(file);

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String op;
        double totalVersement = 0;
        double totalRetrait = 0;
        while ((op=bufferedReader.readLine())!=null){
            String[] tabOp = op.split(";");
            String typeOp = tabOp[0];
            double montant = Double.parseDouble(tabOp[1]);
            if(typeOp.equals("V")){
                totalVersement += montant;
            }else {
                totalRetrait+=montant;
            }
        }
        System.out.println("Total versement : " + totalVersement);
        System.out.println("Total retrait : " + totalRetrait);

    }


}
