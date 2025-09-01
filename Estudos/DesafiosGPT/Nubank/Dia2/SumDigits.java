import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
        String number = scan.nextLine();
        int[] sequence = new int[number.length()];
        int sum = 0;
        int value = 0;
        for (int i = 0; i < sequence.length; i++) {
            if(value < sequence.length){
                value += 1;
            }
            sequence[i] = Integer.parseInt(number.substring(i,value));

        }
        for (int i = 0; i < sequence.length; i++) {
            sum+= sequence[i];
        }
        System.out.println(sum);
    }
}
