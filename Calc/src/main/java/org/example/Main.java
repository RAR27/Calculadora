package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1;
        int n2;
        int resultado;

        Scanner ler = new Scanner(System.in);
        Func calculadora = new Func();

        System.out.println("Digite o primeiro número: ");
        n1 = ler.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = ler.nextInt();

        resultado = calculadora.valorSoma(n1, n2);
        System.out.println("O resultado da soma é: " + resultado);

        resultado = calculadora.valorSubtracao(n1, n2);
        System.out.println("O resultado da subtração é: " + resultado);

        resultado = calculadora.valorDivisao(n1, n2);
        System.out.println("O resultado da divisão é: " + resultado);

        resultado = calculadora.valorMultiplicacao(n1, n2);
        System.out.println("O resultado da multiplicação é: " + resultado);

        //Calculadora finalizada
    }
}