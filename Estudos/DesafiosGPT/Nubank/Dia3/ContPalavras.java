package Dia3;

import java.util.HashMap;
import java.util.Scanner;

public class ContPalavras {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva uma frase:");
        String frase = scan.nextLine();
        HashMap<String,Integer> maps = new HashMap<>();
        int posIni = 0;
        for (int i = 0; i < frase.length(); i++) {
          if (frase.charAt(i) == ' ' && !maps.containsKey(frase.substring(posIni, i).trim())) {
            maps.put(frase.substring(posIni, i).trim(), 1);
            posIni = i ;
          }  else if (frase.length() - 1 == i && !maps.containsKey(frase.substring(posIni, i).trim())) {
            maps.put(frase.substring(posIni, i + 1).trim(), maps.get(frase.substring(posIni, i + 1).trim()) + 1);
          } else if (frase.length() - 1 == i){
                maps.put(frase.substring(posIni, i + 1).trim(), 1);
          } else if (maps.containsKey(frase.substring(posIni, i).trim())){
                maps.put(frase.substring(posIni, i).trim(), maps.get(frase.substring(posIni, i)) + 1);
          }
        }
        System.out.println(maps);
    }
}


/*
 Contagem de Palavras

Enunciado: dada uma frase, conte quantas vezes cada palavra aparece, ignorando espaços extras.

Entrada: "omne estamo em casa estamo"

Saída: {emme=1, estamo=2, em=1, casa=1}
 */