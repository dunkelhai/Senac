package application;

import entities.Conta;
import entities.ContaPj;
import entities.ContaPoupanca;

public class Programa {
    public static void main(String[] args) {

        Conta contaPf = new ContaPj(1,"Lucas",1000.0,100.2);
        ContaPj contaPj = new ContaPj(2,"Maria",200.9,900.0);
        Conta contaEsp = new ContaPj(3, "JOnas", 900.0, 9000.9);

        // UPCASTING

        Conta conta1 = contaPj;
        Conta conta2 = new ContaPj(4,"Alysson",0.0,900.0);
        Conta conta3 = new ContaPoupanca(5,"Lara",0.9,800.0);

        // DOWNVCASTING

        //Casting forcado
        ContaPj conta4 = (ContaPj) conta2;
        conta4.emprestimo(10);

        // ContaPj conta5 = (ContaPj) conta3; Aqui da erro na hora de rodar

        if (conta3 instanceof ContaPj){
            ContaPj conta5 = (ContaPj) conta3;
            conta5.emprestimo(20);
            System.out.println("Empréstimo");
        }
        if (conta3 instanceof ContaPoupanca) {
            ContaPoupanca conta5 = (ContaPoupanca) conta3;
            conta5.atualizarSaldo();
            System.out.println("Atualizado");
        }

        System.out.println(contaEsp.getPortador());



    }
}