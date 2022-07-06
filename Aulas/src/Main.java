package Aulas.src;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.setNome("Larissa");
        pessoa1.setIdade(22);

        System.out.println(pessoa1);

        Conta santander = new Conta();

        santander.setNome("Conta Santander Master");
        santander.setSaldo(20000);
        santander.setSenha(1234);

        System.out.println(santander);






    }
}



