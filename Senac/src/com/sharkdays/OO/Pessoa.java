package com.sharkdays.OO;

public class Pessoa {
    private String primeiroNome;
    private String sobrenome;
    private String nomeDoMeio;
    private double altura;
    private double peso;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Pessoa(String primeiro, String meio, String ultimo){
        primeiroNome = primeiro;
        sobrenome = ultimo;
        nomeDoMeio = meio;
    }

    public String getNomeCompleto(){
        String nomeCompleto = primeiroNome + " " + nomeDoMeio + " " + sobrenome;
        return nomeCompleto;
    }

}
