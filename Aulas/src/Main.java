package Aulas.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Pessoa pessoa1 = new Pessoa();
//
//        pessoa1.setNome("Larissa");
//        pessoa1.setIdade(22);
//
//        System.out.println(pessoa1);
//
//        Conta santander = new Conta();
//
//        santander.setNome("Conta Santander Master");
//        santander.setSaldo(20000);
//        santander.setSenha(1234);
//
//        System.out.println(santander);

//
//
//
//        for (int x = 0; x < 10; x++){
//            System.out.println("boa noite!");
//        }
//
//        boolean chuva = true;
//
        Scanner entrada = new Scanner(System.in);
//        int guardaChuva = 0;
//
//        while (chuva == true){
//            System.out.println("Guarda chuva aberto");
//            System.out.println("Digite a opcao");
//            guardaChuva = entrada.nextInt();
//            if (guardaChuva == 0){
//                chuva = false;
//            } else if (guardaChuva == 1){
//                chuva = true;
//            } else {
//                System.out.println("comando invalido");
//            }
//        }


        Math.pow(10,10);

        // create a string variable

        String language = entrada.next();

        double teste = 2.4567;
        // if statement
        if (language.equals("Java")) {
            System.out.println("Best Programming Language");
            System.out.printf("Teste %.2f%n" ,teste);
        }

    }
}



