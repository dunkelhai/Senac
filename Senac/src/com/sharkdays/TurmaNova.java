package com.sharkdays;

import java.util.Arrays;
import java.util.Random;

public class TurmaNova {
    public static void main(String[] args) {
        String[] vetor = {"Alexandre", "Andrey", "Camilly", "DanielaC", "DanielaL", "Eduardo", "Emanuel", "Ésrom", "Gabriel", "Gabryelli", "GuilhermeS",
        "GuilhermeM", "GuilhermeC", "JoãoR", "JoãoP", "Kamila", "Karolaine", "Kristinny", "Larissa", "Leonardo", "Maria", "Matheus", "Natan",
        "Paula", "PedroV", "PedroG", "Raissa", "Richadson", "Ronald","Wesley"};

        Random aleatorio = new Random();
        int sorteado = aleatorio.nextInt(vetor.length);

        System.out.println(Arrays.toString(vetor));

        System.out.println("O aluno sorteado foi: " + (vetor[sorteado]));


    }
}
