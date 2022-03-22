package aulas;

import java.util.Scanner;

public class Aula03UserInput {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("what is your name?");
        String name = entrada.nextLine();

        System.out.println("how old are you?");
        int age = entrada.nextInt();
        entrada.nextLine();

        System.out.println("what is your favorite food?");
        String food = entrada.nextLine();

        System.out.println("Hello "+name);
        System.out.println("your favorite food is: "+food);

        entrada.close();
    }
}
