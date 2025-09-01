import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FreqCaracters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva uma palvra:");
        String text = scan.nextLine();
        Map<Character,Integer> lista = new HashMap<Character,Integer>();
        for (int i = 0; i < text.length(); i++) {
           if(lista.containsKey(text.charAt(i))){
            lista.put(text.charAt(i),lista.get(text.charAt(i)) + 1 );
           } else {
            lista.put(text.charAt(i), 1);
           }
        }
        System.out.println(lista);
    }
}

/*
 Desafio 1: Frequência de caracteres

Enunciado:
Dada uma string, conte quantas vezes cada caractere aparece.

Entrada: "banana"

Saída: {b=1, a=3, n=2}
 */