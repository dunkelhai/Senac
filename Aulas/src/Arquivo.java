package Aulas.src;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Arquivo {
    public static void main(String[] args) {

        System.out.println("Leitura do arquivo");
        File file =
                new File("C:\\Users\\alysson.oliveira\\Documents/senac.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e){
            System.out.println("Error " + e.getMessage());
            e.printStackTrace();
        } catch (NullPointerException e1){
            e1.printStackTrace();
        } finally {
            if (sc != null){
            sc.close();
            }
        }
    }
}
