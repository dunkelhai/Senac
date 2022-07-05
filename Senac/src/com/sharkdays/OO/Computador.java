package com.sharkdays.OO;

public class Computador {

    private int memoria;
    private char marca;
    private boolean acessaInternet;

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public char getMarca() {
        return marca;
    }

    public void setMarca(char marca) {
        this.marca = marca;
    }

    public boolean isAcessaInternet() {
        return acessaInternet;
    }

    public void setAcessaInternet(boolean acessaInternet) {
        this.acessaInternet = acessaInternet;
    }
}
