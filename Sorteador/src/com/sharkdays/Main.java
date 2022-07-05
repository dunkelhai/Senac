package com.sharkdays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[] {
                "Ademir" ,"Anderson" ,"Anikele" ,"Ariel" ,
                "Eder" ,"Eduardo" ,"Eloisa" ,
                "Fernanda" ,"Fernando" ,"Gabriel" ,
                "Juliano" ,"Lisiane" ,"Lucas" ,
                "Maico" ,"Mauricio" ,"Murilo" ,
                "Nícolas" ,"Rodrigo" ,"Rogério" ,"Wendell"
        };

        System.out.println(
                "Nomes: " + Arrays.toString(names));

        Random r = new Random();
        int idx = r.nextInt(names.length);

        System.out.println(
                "Nome sorteado: " + names[idx]);
    }
}
