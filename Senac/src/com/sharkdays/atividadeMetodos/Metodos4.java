package com.sharkdays.atividadeMetodos;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Metodos4 {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("dd/MM/yyyy HH:mm:ss-> " + dtf.format(LocalDateTime.now()));

    }
}