package Clase_3;
import java.util.Scanner;
public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;

    //Constructor por defecto.

    public Cafetera() {
        this.cantidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    //Constructor con cantidad maxima.

    public Cafetera(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadMaxima;
    }

    //Constructor con cantidad maxima y actual.

    public Cafetera(int cantidadMaxima, int cantidadActual) {
        this.cantidadMaxima = cantidadMaxima;
        if (cantidadActual > cantidadMaxima) {
            this.cantidadActual = cantidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }
    //Getters y Setters.

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;

    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }


    //Llenar cafetera al maximo.

    public void llenarCafetera() {
        this.cantidadActual = this.cantidadMaxima;
        System.out.println("La cafetera esta llena con " + this.cantidadMaxima);
    }

    //Servir café a la taza.

    public void servirTaza(int capacidadTaza) {
        if (this.cantidadActual >= capacidadTaza) {
            System.out.println("Servimos café a la taza");
            this.cantidadActual = this.cantidadActual - capacidadTaza;
        } else {
            System.out.println("No alcanza el café de la cafetera para llenar la taza, " +
                    "servimos esto:" + this.cantidadActual);
            this.cantidadActual = 0;
        }
    }

    // Vaciar la cafetera.

    public void vaciarCafetera() {
        this.cantidadActual = 0;
    }

    //Agregar café a la cafetera.

    public void agregarCafe(int cantidad) {
        if (this.cantidadActual + cantidad > this.cantidadMaxima) {
            this.cantidadActual = this.cantidadMaxima;
            System.out.println("Se agregó café al maximo");
        } else {
            this.cantidadActual += cantidad;
            System.out.println("Se agregó : " + cantidad);
        }
    }

    //Main.

    public static void main(String[] args) {
        Scanner canti = new Scanner(System.in);
        Scanner capa = new Scanner(System.in);
        Cafetera c1 = new Cafetera();
        Cafetera c2 = new Cafetera(1000);
        Cafetera c3 = new Cafetera(1000, 10);

        int opcion = 0;

        do {
            System.out.println("--- MENÚ CAFETERA ---");
            System.out.println("1. Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar cafetera");
            System.out.println("4. Agregar café");
            System.out.println("5. Salir");
            System.out.print("Elegí una opción: ");

            switch (opcion) {

                case 1:
                    c1.llenarCafetera();
                    System.out.println("La cafetera se llenó.");
                    break;

                case 2:
                    System.out.print("Ingresá la capacidad de la taza ");
                    int capacidad = canti.nextInt();
                    c1.servirTaza(capacidad);
                    break;

                case 3:
                    c2.vaciarCafetera();
                    System.out.println("La cafetera se vació.");
                    break;

                case 4:
                    System.out.print("Ingresá la cantidad de café a agregar: ");
                    int cantidad = capa.nextInt();
                    c3.agregarCafe(cantidad);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
            }
        }

        while (opcion != 0);
        canti.close();
        capa.close();

    }
}

