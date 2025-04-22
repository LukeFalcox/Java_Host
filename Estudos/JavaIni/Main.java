import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Variáveis de tipos primitivos
        int idade = 20;
        String nome = "Falco";
        var cpf = "48071179809"; // Tipo inferido para String

        // Tipos numéricos
        byte b = 100;          // 8 bits
        short s = 1000;        // 16 bits
        // int i = 10000;      // 32 bits - Comentado, mas pode ser utilizado
        long l = 1000000L;     // 64 bits
        float f = 10.5f;       // 32 bits (precisão simples)
        double d = 20.5;       // 64 bits (precisão dupla)

        // Tipos de dados primitivos
        char c = 'A';          // Um único caractere
        String str = "DevFalco"; // Texto
        boolean bool = true;   // Valor verdadeiro ou falso

        // Arrays (Vetores)
        int[] colecaodenumeros = {1, 2, 3, 4, 5};
        int[] meusNumeros = new int[5];  // Array de inteiros com 5 posições
        String[] nomesArr = new String[10]; // Array de Strings com 10 posições

        // Atribuindo valores aos índices do array
        nomesArr[1] = "Fernanda";
        nomesArr[2] = "Luke";

        // ArrayList (lista dinâmica)
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Fernanda");
        nomes.add("Leo");
        nomes.add("Joao");
        nomes.add("Maria");

        // Exemplo de operações com ArrayList (comentados para evitar execução)
        // System.out.println(nomes.get(0)); // Imprime "Fernanda"
        // nomes.remove(0); // Remove "Fernanda"
        // nomes.remove("Leo"); // Remove "Leo"
        // System.out.println(nomes.get(0)); // Imprime "Joao"

        // Estruturas de controle (Loops)

        // Exemplo de loop com for
        // for(int i = 0; i < nomesArr.length; i++) {
        //    System.out.println(nomesArr[i]);
        // }

        // Exemplo de loop for-each (para iterar sobre arrays)
        // for (String nomeString : nomesArr) {
        //    System.out.println(nomeString);
        // }

        // Exemplo de loop while
        // int contador = 0;
        // while (contador < 10) {
        //    System.out.println("Estou no While");
        //    contador++;
        // }

        // Casting (Conversão de tipos)
        double resultado = 0.0;
        int resultadoInt = (int) resultado; // Conversão explícita de double para int

        int meuInt = 10;
        double meuDouble = meuInt; // Conversão implícita de int para double

        String meuString = "10";
        int meuInt2 = Integer.parseInt(meuString); // Convertendo String para int

        String minhaString = String.valueOf(meuInt2); // Convertendo int para String

        // Condicionais (if-else)
        // if(str.isBlank()) {
        //     System.out.println("Verdadeiro");
        // } else if(str.equals("DevFalco")) {
        //     System.out.println("DevFalco");
        // } else {
        //     System.out.println("Falso");
        // }

        // Tamanho de um array
        // System.out.println(colecaodenumeros.length);

        Carro sandero = new Sandero();

        SerVivo humano = new Humano();

        humano.respirar();
  

    }
}

