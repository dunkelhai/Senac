package Aulas.src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoEscrever {
    public static void main(String[] args) {

        String[] lines = new String[] {"Bom dia2","Boa tarde", "Boa noite"};

        String path = "/Users/Alysson/Texto/teste2.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
