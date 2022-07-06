package Atividades.src.com.sharkdays;

public class Operadores {
    public static void main(String[] args) {

    int a = 5;
    int b = 10;
    int c = -8;
    int d = 3;
    
    Boolean True;

    
    //A)
        System.out.println(2 * a % 3 - c);
    //B)
        System.out.println(Math.sqrt(-2 * c) / 4);
    //C)
        System.out.println(((20 / 2) / 2) + (Math.pow(2, 8) / 2));
    //D)
        System.out.println((30 % 4 * Math.pow(3,3)) * -1);
    //E)
        System.out.println(Math.pow(-c,2) + (d * 10) / a);
    //F)
        System.out.println(Math.round(Math.sqrt(Math.pow(2,(b / 2)))) + c * -a);
    //G)
        System.out.println(1 - 4 * 3 / 6 - Math.pow(3,2));
    //H)
        System.out.println((Math.pow(5,2)) - 4 / 2 + Math.sqrt(1 + 3 * 5) / 2);

        if (a < b) {
            System.out.printf("%d < %d > %d", a, b, c);
        }
    }
}
