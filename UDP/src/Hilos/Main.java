package Hilos;
import java.lang.Thread;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soy hilo principal" + " " + LocalDateTime.now());

        Hilo_ejemplo hiloE = new Hilo_ejemplo();
        hiloE.start();

        Ejecutable_ejemplo ejecutable_ejemplo = new Ejecutable_ejemplo();
        Thread thread = new Thread();
        thread.start();

        System.out.println("Adiós, te despide el hilo principal" + " " + LocalDateTime.now());

    }
}
