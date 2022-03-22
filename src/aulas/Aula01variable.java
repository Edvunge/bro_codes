package aulas;

public class Aula01variable {
    public static void main(String[] args) {

        int idade = 26;
        float altura = 1.89f;
        double peso = 79.8;
        long numeroTelefone = 912270832L;
        char primeiraLetraNome = 'E';
        boolean aprovadoOuNao = true;
        byte diaDoMes = 20;
        short numerus = 12;

        // o String é um tipo primitivo e não uma variavel.

        /*
        mais é assim que se declara uma variavel do tipo String.
        String nome = "edvaldo";
         */

        System.out.println("a sua idade é: " + idade);
        System.out.println("a sual altura é: " + altura);
        System.out.println("o teu peso é de : " + peso);
        System.out.println("o seu numero de telefone é: " + numeroTelefone);
        System.out.println("a primeira letra do seu nome é : " + primeiraLetraNome);
        System.out.println("qual foi o seu resultado? " + aprovadoOuNao);
        System.out.println("hoje é dia: " + diaDoMes);
        System.out.println(numerus);

    }
}
