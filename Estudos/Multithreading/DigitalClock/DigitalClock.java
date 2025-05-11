import java.util.Scanner;

public class DigitalClock {

  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Deseja continuar mostrando o horário? (Sim/Não)");
      String resposta = scanner.nextLine();

      if (resposta.equalsIgnoreCase("Sim")) {
          ClockThread clock = new ClockThread();
          clock.start();

          System.out.println("Pressione ENTER para parar o relógio...");
          scanner.nextLine(); // Espera o usuário pressionar Enter
          clock.parar();
      }

      System.out.println("Programa encerrado.");
  }
}
