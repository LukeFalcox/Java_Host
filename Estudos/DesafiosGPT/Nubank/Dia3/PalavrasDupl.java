package Dia3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PalavrasDupl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        String frase = scan.nextLine();
        ArrayList lista = new ArrayList<String>();
        int posIni = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ' && !lista.contains(frase.substring(posIni,i).trim())) {
                lista.add(frase.substring(posIni, i).trim());
                posIni = i;
            } else if(frase.length() - 1 == i && !lista.contains(frase.substring(posIni,i).trim())){
                lista.add(frase.substring(posIni, i + 1).trim());
            } else if(lista.contains(frase.substring(posIni,i).trim())){
                posIni = i;
        }
    }
        Collections.sort(lista);
        System.out.println(lista);
    }
}
