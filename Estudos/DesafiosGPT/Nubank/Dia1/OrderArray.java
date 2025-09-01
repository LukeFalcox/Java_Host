import java.util.Arrays;
import java.util.Scanner;

public class OrderArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidades de numeros:");
        int value = scan.nextInt();
        int[] numbers = new int[value];
        for (int i = 0; i < value; i++) {
            if (i == 0) {
                System.out.println("Digite um valor:");
                numbers[i] = scan.nextInt();
            } else {
                System.out.println("Digite outro valor:");
                numbers[i] = scan.nextInt();
            }
        }
        System.out.println("Desorganizado: "+Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Organizado: "+Arrays.toString(numbers));
    }
}

/*

1. Ordenar array (Bubble Sort e Arrays.sort)

📌 Enunciado:
Dado um array de inteiros, implemente a ordenação primeiro manualmente com Bubble Sort, e depois utilizando Arrays.sort() para comparar.

Entrada: [5, 1, 4, 2, 8]
Saída: [1, 2, 4, 5, 8]
 */