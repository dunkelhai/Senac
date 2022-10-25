package Atividades.src.com.entities;

public class ContaBancaria {
    int codigo;
    String titular;
    double saldo;

    public ContaBancaria(int codigo, String titular, double saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "codigo=" + codigo +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
