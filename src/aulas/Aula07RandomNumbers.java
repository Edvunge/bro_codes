package aulas;

import java.util.Random;

public class Aula07RandomNumbers {
    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(633)+1;
        //double y = random.nextDouble();
        //boolean z = random.nextBoolean();

        System.out.println(x);
    }
}
