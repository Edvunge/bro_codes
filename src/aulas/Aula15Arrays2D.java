package aulas;

public class Aula15Arrays2D {
    public static void main(String[] args) {
        // 2D array = an array of arrays

        String[][] cars = {
                {"camaro","corvete","silverado"},
                {"mustang","ranger","F-150"},
                {"ferrari","lambo","tesla"}
        };

        for (int i=0; i< cars.length; i++) {
            System.out.println();
            for (int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }

    }
}
