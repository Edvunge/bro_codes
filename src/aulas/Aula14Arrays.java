package aulas;

public class Aula14Arrays {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable

        String[] cars = new String[3];

        cars[0] = "camaro";
        cars[1] = "corvete";
        cars[2] = "tesla";

        for (int i=0; i<cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
