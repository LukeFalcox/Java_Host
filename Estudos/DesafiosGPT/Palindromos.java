package DesafiosGPT;

import java.util.Scanner;

public class Palindromos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase:");
        String text = scan.nextLine();
        String textinverter = "";

        Integer lengthtext = text.length();
        System.out.println("Texto original: " + text);
        System.out.println("Tamanho do texto: " + lengthtext);
        while (lengthtext > 0) {
            textinverter += text.charAt(lengthtext -1);
            lengthtext--;
            System.out.println("Texto invertido: " + textinverter);
        }
        textinverter = textinverter.trim();
        System.out.println("Texto invertido final: " + textinverter);
        if (text.contains(textinverter)) {
            System.out.println("É um palindromo!");          
        } else {
            System.out.println("Nao é um palindromo!");
        }

    }
}