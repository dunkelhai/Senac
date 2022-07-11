package entities;

// abstract serve para dizer que a classe serve so pra estender, nao pode ser instanciada
public abstract class Conta {
    private Integer numero;
    private String portador;

    // protectede usado para classes do mesmo pacote e pacote diferentes que estendam a classe
    protected Double saldo;

    public Conta() {

    }

    public Conta(Integer numero, String portador, Double saldo) {
        this.numero = numero;
        this.portador = portador;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPortador() {
        return portador;
    }

    public void setPortador(String portador) {
        this.portador = portador;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void saque(double quantia){
        saldo -= quantia;
    }

    public void deposito(double quantia){
        saldo += quantia;
    }


}
