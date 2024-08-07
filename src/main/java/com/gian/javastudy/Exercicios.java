package com.gian.javastudy;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicios {

    public void ex01() {
        System.out.println(hello());
    }

    public void ex02(){
        lerNome();
    }

    public void ex03(){
        lerNomeESalario();
    }

    public void ex04(){
        somaDoisNumeros();

    }











    // Exibe um hello World na tela
    public String hello() {
        return "hello, World!";
    }

    // Le o nome do usuário e faz uma saudação
    public String lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é seu nome?");
        String nome = scanner.nextLine();
        return System.out.printf("Ola! %s é um prazer te conhecer!", nome).toString();
    }

    // informa o mês atual
    public String mesAtual() {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM", new Locale("pt", "BR"));
        return dataAtual.format(formatter);  // Retorna o nome do mês atual em português
    }

    // Le o nome e informa o salário no mes atual
    public String lerNomeESalario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o nome do funcionário?");
        String nomeFuncionario = scanner.nextLine();
        System.out.println("Qual o salário do funcionário?");
        String salarioFuncionario = scanner.nextLine();

        return System.out.printf("O funcionário %s tem um salário de R$%s em %s%n", nomeFuncionario, salarioFuncionario, mesAtual()).toString();



    }


    // Le dois número e soma ambos
    public PrintStream somaDoisNumeros(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Informe um número inteiro: ");
                int valor1 = scanner.nextInt();
                System.out.println("Informe outro número inteiro: ");
                int valor2 = scanner.nextInt();
                int soma = valor1 + valor2;

                return System.out.printf("A soma entre %d e %d é %d", valor1, valor2, soma);

            }catch (InputMismatchException e){
                System.out.println("ERRO!!! Por favor informe somente números inteiros!");
                scanner.next(); // Limpa o scanner

            }


        }
    }

}
