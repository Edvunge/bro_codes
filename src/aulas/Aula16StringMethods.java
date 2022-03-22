package aulas;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Aula16StringMethods {
    public static void main(String[] args) {
        // String = a reference data type  that can store one or more characters
        //          reference data types have acess to useful methods

        String name = "Edvaldo";

        boolean result = name.equalsIgnoreCase("edvaldo");
        int resultInt = name.length();
        char resultChar = name.charAt(0);
        int resultINT = name.indexOf("o");
        boolean resultBoolean = name.isEmpty();
        String resultStringUpper = name.toUpperCase();
        String resultStringLower = name.toLowerCase();
        String resultStringTrim = name.trim();
        String resultStringReplace = name.replace('o', 'a');

        System.out.println(result);
        System.out.println(resultInt);
        System.out.println(resultChar);
        System.out.println(resultINT);
        System.out.println(resultBoolean);
        System.out.println(resultStringUpper);
        System.out.println(resultStringLower);
        System.out.println(resultStringTrim);
        System.out.println(resultStringReplace);




    }
}
