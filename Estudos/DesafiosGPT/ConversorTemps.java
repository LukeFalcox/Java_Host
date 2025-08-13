package DesafiosGPT;

import java.util.Scanner;

public class ConversorTemps {
   

    public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.println("Digite a temperatura em Celsius:");
         Integer temp = scan.nextInt();

            System.out.println("Temperatura em Fahrenheit: " + ((temp * 1.8) + 32));
         System.out.println("Temperatura em Kelvin:"+ (temp + 273.15));
    }
    
}