package entities;

public class ContaPoupanca extends Conta{

    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String portador, Double saldo, Double taxaJuros) {
        super(numero, portador, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo(){
        saldo += saldo * taxaJuros;
    }


}
