//package com.sharkdays;
//
//import javax.swing.*;
//import java.awt.event.*;
//
//class Calculadora extends JFrameWithBackground {
//
//    private JButton numero1;
//    private JButton numero2;
//    private JButton somar;
//    private JButton igual;
//    private JTextField display;
//    private int leitura;
//    private int memoria;
//    private char operacao;
//
//    public Calculadora() {
//        this.setTitle("Exemplo Botão Somar");
//        this.setBounds(0, 0, 267, 235);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        this.getContentPane().setLayout(null);
//
//        leitura = 0;
//        memoria = 0;
//
//        somar = new JButton();
//        somar.setText("+");
//        somar.setBounds(145, 70, 78, 45);
//        this.add(somar);
//
//        igual = new JButton();
//        igual.setText("=");
//        igual.setBounds(25, 130, 200, 45);
//        this.add(igual);
//
//        numero1 = new JButton();
//        numero1.setText("1");
//        numero1.setBounds(25, 70, 45, 45);
//        this.add(numero1);
//
//        numero2 = new JButton();
//        numero2.setText("2");
//        numero2.setBounds(85, 70, 45, 45);
//        this.add(numero2);
//
//        display = new JTextField();
//        display.setBounds(25, 25, 200, 30);
//        this.add(display);
//
//        numero1.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                leitura *= 10;
//                leitura += 1;
//                display.setText(display.getText() + "1");
//            }
//        });
//
//        numero2.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                leitura *= 10;
//                leitura += 2;
//                display.setText(display.getText() + "2");
//            }
//        });
//
//        somar.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                operacao = '+';
//                memoria += leitura;
//                leitura = 0;
//                display.setText("");
//            }
//        });
//
//        igual.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent evt) {
//                switch (operacao) {
//                    case '+': {
//                        memoria += leitura;
//                        break;
//                    }
//                }
//                leitura = 0;
//                display.setText("" + memoria);
//            }
//        });
//    } // construtor
//
//    public static void main(String[] args) {
//        Calculadora exemplo = new Calculadora();
//        exemplo.setVisible(true);
//    }
//} // classe
