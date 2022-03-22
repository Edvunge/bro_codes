package exercicios;

import java.util.Scanner;

public class Exercicio04Scanner {
    public static void main(String[] args) {
        /*
        Crie um algoritmo em Java que leia um número
        inteiro, calcule seu dobro e mostre o resultado
        */
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero?");
        int number = input.nextInt();

        int dobroDeUmNumero = number * number;

        System.out.printf(" o dobro do %d é %d " ,number , dobroDeUmNumero);

        input.close();
    }
}
