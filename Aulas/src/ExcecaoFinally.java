package Aulas.src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcecaoFinally {
    public static void main(String[] args) {
        File file = new File("/Users/Alysson/Texto/teste.txt");
        Scanner entrada = null;
        try {
            entrada = new Scanner(file);
            while(entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println("Erro ao abrir o arquivo!" + e.getMessage());
        } finally {
            if (entrada != null){
                entrada.close();
            }
        }
    }
}
