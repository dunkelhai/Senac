package application;

import entities.Pessoa;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class Programa {
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de pessoas a ser cadastrado "));

        Pessoa pessoas[] = new Pessoa[numero];

        for (int i = 0; i < pessoas.length; i++) {

            String nome = JOptionPane.showInputDialog("Digite o nome: ", null);
            Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ", null));
            Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: ", null));
            Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: ", null));

            pessoas[i] = new Pessoa(i, nome, idade, altura, peso);
        }


        //CRESCENTE ID
        Arrays.stream(pessoas).sorted(new Comparator<Pessoa>(){
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getId().compareTo(p2.getId());
            }
        }).forEach(x-> System.out.println(x.toString()));

        //DECRESCENTE IMC
        Arrays.stream(pessoas).sorted(new Comparator<Pessoa>(){
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        }).forEach(x-> System.out.println(x.toString()));

        //CRESCENTE ALTURA
        Arrays.stream(pessoas).sorted(new Comparator<Pessoa>(){
            @Override
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        }).forEach(x-> System.out.println(x.toString()));

        //MEDIA IDADE, PESO, IMC

        double altura = 0;
        int idade = 0;
        double imc = 0;

        for (int i = 0; i < pessoas.length; i++){
                altura += pessoas[i].getAltura();
                idade += pessoas[i].getIdade();
                imc += pessoas[i].getIMC(pessoas[i].getPeso(), pessoas[i].getAltura());

                altura = altura / pessoas.length;
                idade = idade / pessoas.length;
                imc = imc / pessoas.length;

            System.out.println("Média altura: " + altura);
            System.out.println("Média Idade: " + idade);
            System.out.println("Média altura: " + imc);
        }

            }

    }
