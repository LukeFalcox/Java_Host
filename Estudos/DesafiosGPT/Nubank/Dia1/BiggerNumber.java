import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidades de Numeros:");
        int number = scan.nextInt();
        int[] sequence = new int[number];
        int numberchoice = 0;
        int biggernumber = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (i==0) {
                System.out.println("Escolha um numero:");
                numberchoice = scan.nextInt();
                sequence[i] = numberchoice;
            }else{
                System.out.println("Escolha outro numero:");
                numberchoice = scan.nextInt();
                sequence[i] = numberchoice;
            }
        }
        for (int i = 0; i < sequence.length; i++) {
            if (biggernumber < sequence[i]) {
                biggernumber = sequence[i];
            }
        }
        System.out.println("O maior numero da sequencia é:"+biggernumber);
    }
}
