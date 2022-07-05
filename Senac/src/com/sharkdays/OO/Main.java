package com.sharkdays.OO;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta contaRogerio = new Conta();

        Carro fox = new Carro();

        conta1.Depoositar(100);
        conta2.Depoositar(500);
        contaRogerio.Depoositar(50000);

        System.out.println("O valor em saldo da conta 1 é de " + conta1.RetornarSaldo());
        System.out.println("O valor em saldo da conta 1 é de " + conta2.RetornarSaldo());

        Pessoa pessoa1 = new Pessoa("Agostinho","Carrara","De Alcantra");
        System.out.println(pessoa1.getNomeCompleto());
        Pessoa pessoa2 = new Pessoa("Rogerio", "da Silva", "Dias");
        System.out.println("O saldo do " + pessoa2.getNomeCompleto() + " é de " + contaRogerio.RetornarSaldo());

        fox.setCor("Azul");
        System.out.println(fox.getCor());
        fox.setVelocidade(100);
        System.out.println(fox.getVelocidade());

        fox.setVelocidadeMaxima(180);
        int x = fox.getVelocidadeMaxima();

        System.out.println(x);

        pessoa2.setPeso(88);
        pessoa2.setAltura(180);

        System.out.println(pessoa2.getPeso() +" "+ pessoa2.getAltura());

        pessoa2.hashCode();

        Celular celularFernando = new Celular();

        celularFernando.setFabricante("Apple");
        celularFernando.setArmazenamentoInterno("128 GB");
        celularFernando.setNumeroDeCameras(3);

        Computador acerMegaPowerDoJuliano = new Computador();

        acerMegaPowerDoJuliano.setAcessaInternet(true);
        acerMegaPowerDoJuliano.setMarca('a');
        acerMegaPowerDoJuliano.setMemoria(64);

    }
}
