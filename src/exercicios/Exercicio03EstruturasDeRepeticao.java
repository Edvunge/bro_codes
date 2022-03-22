package exercicios;

import java.util.Scanner;

public class Exercicio03EstruturasDeRepeticao {
    public static void main(String[] args) {
        /*
Crie um algoritmo que recebe 2 números e
multiplica o num 1 pelo num 2 através de somas
repetidas
...(ex 2 e 3 = 2 + 2 + 2 )
         */

        Scanner input = new Scanner(System.in);

        /*System.out.println("indique o primeiro numero?");
        int numberOne = input.nextInt();

        System.out.println("indique o segundo numero?");
        int numberTwo = input.nextInt();*/

        int j = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }

        input.close();
    }
}
