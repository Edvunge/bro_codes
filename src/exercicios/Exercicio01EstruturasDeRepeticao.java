package exercicios;

import java.util.Scanner;

public class Exercicio01EstruturasDeRepeticao {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
            // Crie um algoritmo que leia um número e escreva a
            // sequência de zero até o número.

        System.out.println("indique um numero: ");
        int number = input.nextInt();

        for (int i = 0; i <= number; i++ ) {
            System.out.println(i);
        }

        input.close();
    }
}
