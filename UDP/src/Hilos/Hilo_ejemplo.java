package Hilos;
import java.lang.Thread;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
public class Hilo_ejemplo extends Thread {
    @Override
    public void run(){
        try {
            int numRandom = ThreadLocalRandom.current().nextInt();
            System.out.println("Hola, soy un hilo cualquiera" + " " + LocalDateTime.now());
            Thread.sleep(10000);
            System.out.println("Adiós, te despide un hilo cualquiera" + " " + LocalDateTime.now());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
