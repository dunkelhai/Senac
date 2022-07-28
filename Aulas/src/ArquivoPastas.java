package Aulas.src;

import java.io.File;
import java.util.Scanner;

public class ArquivoPastas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o nome de uma pasta e  local: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);


        //Listar pastas
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        //Listar arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File file : files){
            System.out.println(file);
        }

        //Criar subpasta

        boolean deuCerto = new File(strPath + "\\pastaTeste").mkdir();
        System.out.println("Diretório criado com sucesso: " + deuCerto);

        sc.close();
    }
}
