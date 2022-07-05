package com.sharkdays.OO;

public class Conta {

    int conta;
    double saldo;
    String senha;

    public void Depoositar(double valor){
        this.saldo = this.saldo + valor;
    }

    public double RetornarSaldo(){
        return this.saldo;
    }
}
