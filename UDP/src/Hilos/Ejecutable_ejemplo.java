package Hilos;
import java.lang.Thread;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
public class Ejecutable_ejemplo extends Thread {
    @Override
    public void run(){
        try {
            int numRandom = ThreadLocalRandom.current().nextInt();
            System.out.println("Hola, soy un ejecutable cualquiera" + " " + LocalDateTime.now());
            Thread.sleep(numRandom);
            System.out.println("Adiós, te despide un ejecutable cualquiera" + " " + LocalDateTime.now());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
