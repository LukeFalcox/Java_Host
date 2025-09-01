import java.util.Scanner;

public class InvertStr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um texto:");
        String textString = scan.nextLine();
        String inverttextString = "";
        int value = 0;
        for (int i = textString.length(); i > 0; i--) {
            if (value <= i) {
              value = i-1;  
            }
            inverttextString += textString.substring(value, i);
        }
        System.out.println(inverttextString);
    }
}