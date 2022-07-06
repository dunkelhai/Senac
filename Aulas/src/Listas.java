package Aulas.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Jonas");
        lista.add("Nick");
        lista.add("Mike");
        lista.add("Steve");
        lista.add("Cláudio");
        lista.add(3, "Marrocos");

        System.out.println(lista.size());

        lista.remove("Steve");

        for (String item : lista) {
            System.out.println(item);
        }

        lista.removeIf(item -> item.charAt(0) == 'M');

        for (String item : lista) {
            System.out.println(item);
        }

        System.out.println("Index of: " + lista.indexOf("Jonas"));
        //Se imprimir o index como -1 significa que não tem o item na lista
        System.out.println("Index of: " + lista.indexOf("Kevin"));

        //forma do java 8 para fazer operacoes de lambida com list antiga. Converte para stream, faz o que precisa, depois volta para lista.
        List<String> resultado = lista.stream().filter(item -> item.charAt(0) == 'C').collect(Collectors.toList());

        for (String item : resultado) {
            System.out.println(item);
        }



    }
}
