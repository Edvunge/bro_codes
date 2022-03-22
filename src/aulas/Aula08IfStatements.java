package aulas;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Aula08IfStatements {
    public static void main(String[] args) {
        int age = 27;

        if(age > 18) {
            System.out.println("you are an adult!");
        } else {
            System.out.println("you are a teenager!");
        }

    }
}
