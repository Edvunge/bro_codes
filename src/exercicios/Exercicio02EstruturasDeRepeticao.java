package exercicios;

import java.util.Scanner;

public class Exercicio02EstruturasDeRepeticao {
    public static void main(String[] args) {
        /*
Crie um algoritmo que leia um número e escreva a
sequência decrescente até o zero.
*/
        Scanner input = new Scanner(System.in);

        System.out.println("indique um numero: ");
        int number = input.nextInt();

        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        input.close();

    }
}