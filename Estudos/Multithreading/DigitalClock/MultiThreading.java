import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


class ClockThread extends Thread {
    private volatile boolean rodando = true;

    public void parar() {
        rodando = false;
    }

    @Override
    public void run() {
        while (rodando) {
            String horaAtual = new SimpleDateFormat("HH:mm:ss").format(new Date());
            System.out.println(horaAtual);
            try {
                Thread.sleep(1000); // espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
