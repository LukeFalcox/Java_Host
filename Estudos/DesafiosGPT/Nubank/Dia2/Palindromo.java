import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um palavra");
        String text = scan.nextLine();
        String textinvert = "";
        Integer value = text.length();
        for (int i = text.length(); i >= 0; i--) {
            if (value >= 1) {
                value = value - 1;
            }
            textinvert += text.substring(value, i);
        }

        System.out.println(text + " - " + textinvert);

        if (textinvert.equals(text)) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não é Palindromo");
        }
    }

    /*
     * COrreção poderia utilizar o StringBuilder (Biblioteca) para fazer a string
     * reversa
     * Pontos a melhorar:
     * 
     * O laço for (int i = text.length(); i >= 0; i--) é arriscado → vai causar
     * StringIndexOutOfBoundsException (índice negativo ou igual ao tamanho da
     * string).
     * 
     * Você poderia usar charAt em vez de substring, ficaria mais claro e eficiente.
     * 
     * Evitar concatenar strings dentro de um laço → em Java isso é custoso, prefira
     * StringBuilder.
     * 
     * Versão enxuta:
     */
}
