package DesafiosGPT;
import java.util.Scanner;

public class TabuadaPersonalizada {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número para ver sua tabuada:");
            Integer num = scan.nextInt();
            System.out.println("Digite o Limite: ");
            Integer limite = scan.nextInt();
            for (int i = 1; i <= limite; i++) {
                System.out.println("Resultado: " + num + " x " + i + " = " + (num * i));
            }
        }   
}
