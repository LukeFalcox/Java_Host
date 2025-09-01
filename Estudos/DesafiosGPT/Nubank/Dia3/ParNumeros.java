package Dia3;

import java.util.HashMap;
import java.util.Scanner;

public class ParNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero alvo:");
        int target = scan.nextInt();
        System.out.println("Quantidades de Numeros:");
        int number = scan.nextInt();
        int[] sequence = new int[number];
        int numberchoice = 0;
        HashMap<Integer,Integer> mapa = new HashMap<>();
        for (int i = 0; i < sequence.length; i++) {
            if (i==0) {
                System.out.println("Digite um numero menor que o alvo:");
                numberchoice = scan.nextInt();
                sequence[i] = numberchoice;
            }else{
                System.out.println("Digite outro numero menor que o alvo:");
                numberchoice = scan.nextInt();
                sequence[i] = numberchoice;
            }
        }

        for (int i = 0; i < sequence.length; i++) {
            int complemento = sequence[i] - target;
            if (mapa.containsKey(complemento)) {
            System.out.println(mapa);
            System.out.println("["+mapa.get(complemento)+","+i+"]");
            }
            mapa.put(sequence[i], i);
        }
       
        
    }
}
