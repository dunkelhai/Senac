package entities;

public class Pessoa {
    Integer id;
    String nome;
    Integer idade;
    Double altura;
    Double peso;

    public Pessoa(Integer id, String nome, Integer idade, Double altura, Double peso) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public double getIMC(Double peso, Double altura){
        return peso / Math.pow(altura,2);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
