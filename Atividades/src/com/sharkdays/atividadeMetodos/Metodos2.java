package Atividades.src.com.sharkdays.atividadeMetodos;


import java.util.Scanner;

public class Metodos2 {

    public static double pitagoras(double c1, double c2){

        double hipotenusa;

        hipotenusa = Math.sqrt(Math.pow(c1, 2) + Math.pow(c2,2));

        return hipotenusa;

    }

    public static void main(String[] args) {

        double c1,c2;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Digite o cateto 1");
        c1 = entrada.nextDouble();
        System.out.println("Digite o cateto 2");
        c2 = entrada.nextDouble();

        System.out.println(pitagoras(c1,c2));


    }

}