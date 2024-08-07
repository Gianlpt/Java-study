package com.gian.javastudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exercicios exercicios = new Exercicios();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número do exercicio:");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                exercicios.ex01();
                break;
            case 2:
                exercicios.ex02();
                break;
            case 3:
                exercicios.ex03();;
                break;
            case 4:
                exercicios.ex04();
                break;
            default:
                System.out.println("Opção inválida.");
                break;


        }
    }
}