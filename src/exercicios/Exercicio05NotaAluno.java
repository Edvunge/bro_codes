package exercicios;

import java.util.Scanner;

public class Exercicio05NotaAluno {
    public static void main(String[] args) {

        /*
        Crie um algoritmo que leia a nota de um aluno e
        mostre se ele está
        aprovado (acima de 60)
        em recuperação (abaixo de 60) ou
        reprovado por média (abaixo de 20).
        */

        Scanner input = new Scanner(System.in);

        System.out.println(" digite a sua nota de aluno? ");
        int notaAluno = input.nextInt();

        if (notaAluno >= 60) {
            System.out.println(" aluno aprovado. ");
        } else
            if (notaAluno < 60) {
            System.out.println(" aluno em recuperação. ");
        } else
            if (notaAluno < 20 ) {
            System.out.println(" aluno reprovado ");
        }

        input.close();
    }
}
