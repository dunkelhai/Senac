
package com.sharkdays;

import java.util.ArrayList;
import java.util.List;

public class LoopArray {

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5 };

        for (int i : intArray)
            System.out.println("Java FOR para cada loop com Array -  " + i);

        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        for (String f : frutas)
            System.out.println("Java FOR para cada loop com Lista - " + f);
    }

}
