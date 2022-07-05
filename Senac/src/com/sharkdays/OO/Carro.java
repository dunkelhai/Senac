package com.sharkdays.OO;

public class Carro {
    private int velocidade;
    private String cor;
    private int velocidadeMaxima;


    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(int pedal) {

         this.velocidade = this.velocidade + pedal;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}