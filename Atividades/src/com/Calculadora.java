package Atividades.src.com;

public class Calculadora {
    public void soma(int x, int y){
        System.out.println(x + y);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.soma(2,4);
    }
}
