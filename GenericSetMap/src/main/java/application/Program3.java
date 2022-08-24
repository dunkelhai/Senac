package application;

import java.util.Arrays;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {
        List<Integer> listaInteiro = Arrays.asList(5,2,3,4,6);
        printList(listaInteiro);

        List<String> listaString = Arrays.asList("Maria","Jana","Naty");
        printList(listaString);
    }
    
    public static void printList(List<?> lista){
        for (Object obj: lista) {
            System.out.println(obj);
        }
    }
    
}

