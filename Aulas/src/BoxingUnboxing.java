package Aulas.src;

public class BoxingUnboxing {

    public static void main(String[] args) {

        //Boxing
        int x = 10;
        Object obj = x;
        System.out.println(obj);

        //Unboxing
        int y = (int) obj;
        System.out.println(y);

        //Com Wrapper

        //Boxing
        int z = 20;
        Integer obj2 = z;
        System.out.println(obj2);

        //Unboxing
        int w = obj2;
        System.out.println(w);

    }
}
