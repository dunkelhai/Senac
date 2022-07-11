package entities;

//final na classe evita que ela seja herdada
public final class ContaPoupanca extends Conta{

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

    //final no metodo nao deixa que o metodo seja sobreposto
    public final void atualizarSaldo(){
        saldo += saldo * taxaJuros;
    }
    @Override
    public void saque(double quantia) {
        super.saque(quantia * 2);
    }
}
