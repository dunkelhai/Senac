package Senac.src.com.sharkdays;

import java.util.Scanner;

//Exibir MES

public class AtividadeProcedimentos1 {
    public static void main(String[] args) {
        int mes;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um mês: ");
        mes = entrada.nextInt();

        exibirMes(mes);
    }

    static void exibirMes(int mes){
        String texto;
        switch (mes){
            case 1:
                texto = "Janeiro";
                break;
            case 2:
                texto = "Fevereiro";
                break;
            case 3:
                texto = "Março";
                break;
            default:
                texto = "Mês inexistente!";
                break;

        }

        System.out.println("O mês correspondente é " + texto);
        System.out.println("Teste");
    }
}
