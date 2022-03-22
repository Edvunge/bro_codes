package aulas;

public class Aula09Switch {
    public static void main(String[] args) {
        String day = "friday";

        switch (day){
            case "sunday":
                System.out.println("it is sunday");
                break;
            case "monday":
                System.out.println("it is monday");
                break;
            case "tuesday":
                System.out.println("it is tuesday");
                break;
            case "wednesday":
                System.out.println("it is wednesday");
                break;
            case "Thursday":
                System.out.println("it is Thursday");
                break;
            default:
                System.out.println("that is not a day!");

        }
    }
}
