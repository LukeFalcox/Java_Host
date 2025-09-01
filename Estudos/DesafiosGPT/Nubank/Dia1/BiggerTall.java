import java.util.Scanner;

public class BiggerTall {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidades de numeros:");
        int value = scan.nextInt();
        int[] numbers = new int[value];
        int menor = 0;
        int maior = 0;
        for (int i = 0; i < value; i++) {
            if (i == 0) {
                System.out.println("Digite um valor:");
                numbers[i] = scan.nextInt();
            } else {
                System.out.println("Digite outro valor:");
                numbers[i] = scan.nextInt();
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                menor = numbers[i];
                maior = numbers[i];
            }
            if (maior < numbers[i]) {
                maior = numbers[i];       
            } 
            if (menor > numbers[i]) {
                menor = numbers[i];   
            }
        }
        if (maior != menor) {
            System.out.println("Maior = "+ maior + " Menor = "+ menor);
        } else {
            System.out.println("São iguais");
        }
    }
}

/*
 * 🔹 Desafio 3: Maior e menor número no array
 * 
 * Enunciado:
 * Dado um array de inteiros, retorne o maior e o menor número.
 * 
 * Entrada: [8, 3, 15, 2, 9]
 * 
 * Saída: Maior = 15, Menor = 2
 */
