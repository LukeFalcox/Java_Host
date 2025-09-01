import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    // Minha Logica
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     System.out.println("Alvo:");
    //     int number   = scan.nextInt();
    //     int[] numbers = {2, 7, 11, 15};
    //     outerLoop:
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = 0; j < numbers.length; j++) {
    //          if (numbers[i] + numbers[j] == number) {
    //             System.out.println("["+i+","+j+"]");
    //             break outerLoop;
    //          }   
    //         }         
    //     }
    // }
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int alvo = 17;

        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complemento = alvo - nums[i];

            if (mapa.containsKey(complemento)) {
                System.out.println(mapa);
                System.out.println("["+ mapa.get(complemento)+", "+i +"]");
                return;
            }

            mapa.put(nums[i], i);
        }
    }
}

/*
 🔹 Desafio 2: Two Sum

Enunciado:
Dado um array de inteiros e um valor alvo, encontre os dois índices cujos valores somam esse alvo.

Entrada: nums = [2, 7, 11, 15], alvo = 9

Saída: [0, 1] (porque 2 + 7 = 9)
 */