package entities;

public class ContaPj extends Conta{

    private Double limiteEmprestimo;

    public ContaPj() {
        super();
    }

    public ContaPj(Integer numero, String portador, Double saldo, Double limiteEmprestimo) {
        super(numero, portador, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }
    public void emprestimo(double quantia){
        if (quantia <= limiteEmprestimo){
        deposito(quantia);
        saldo += quantia - 10.0;
        }
    }

    @Override
    public void saque(double quantia){
        super.saque(quantia);
        saldo -= 2;
    }
}
