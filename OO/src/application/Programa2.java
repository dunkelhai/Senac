package application;

import entities.Conta;
import entities.ContaPj;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Programa2 {
    public static void main(String[] args) {

        //Imprimir com . os decimais
        Locale.setDefault(Locale.US);

        List<Conta> lista = new ArrayList<>();

        lista.add(new ContaPoupanca(1,"Alysson",200.56897,10.0));
        lista.add(new ContaPj(2,"Joana",200.56,10.0));
        lista.add(new ContaPoupanca(3,"Marcos",20342.0,1000.0));

        double soma = 0.0;

        for (Conta conta: lista) {
            soma += conta.getSaldo();
        }
        System.out.printf("A soma totoal dos saldos é: %.4f%n",soma);

        for (Conta conta: lista) {
            conta.deposito(10.00);
        }

        for (Conta conta:lista) {
            System.out.printf("Atualizar saldo para conta %d: %.2f%n", conta.getNumero(), conta.getSaldo());
        }


    }
}
