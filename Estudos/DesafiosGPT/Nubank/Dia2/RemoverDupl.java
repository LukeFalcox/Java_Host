import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoverDupl {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
        System.out.println("Quantidades de numeros:");
        int value = scan.nextInt();
        Set<Integer> numbers = new HashSet<>(); // HASHSET não contem os itens duplicados.

        for (int i = 0; i < value; i++) {
         System.out.println("Digite um valor:");
         int num = scan.nextInt();
         
         numbers.add(num);
        }

        System.out.println("Valores unicos: "+ numbers);
    }
}
/*
 * 🔹 Desafio 4 (extra): Remover duplicados

Enunciado:
Dado um array de inteiros, remova os elementos duplicados.

Entrada: [1, 2, 2, 3, 4, 4, 5]

Saída: [1, 2, 3, 4, 5]
 */