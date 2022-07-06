package Aulas.src;

public class Conta {
    String nome;
    int Senha;
    double Saldo;


    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", Senha=" + Senha +
                ", Saldo=" + Saldo +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSenha() {
        return Senha;
    }

    public void setSenha(int senha) {
        Senha = senha;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}
