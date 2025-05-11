import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Arqvs {
  public static void main(String[] args) {
    ArqvThreading arqvThreading = new ArqvThreading();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Esta sendo baixado um virus");
    arqvThreading.start();
    System.out.println("Aperte enter para parar");
    scanner.nextLine();
    arqvThreading.parar();
    System.out.println("Encerrado");
    
   
}
}

 class ArqvThreading extends Thread {
  private volatile boolean rodando = true;

  public void parar(){
    rodando = false;
  }


  @Override
  public void run(){
    while (rodando) {
      String data = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
      System.out.println("title"+data);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  }
}



/*
 Desafio:
Simule o download de vários arquivos ao mesmo tempo:

Cada arquivo deve ser baixado por uma thread diferente.

Mostre o progresso de cada download.

Dica:

Simule o tempo de download usando sleep.

Mostre o status de cada download separadamente.
 */