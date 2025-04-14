package Clase_2;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche(String marca, String modelo, String color, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    public Coche() {
        this.marca = "Chevrolet";
        this.modelo = "Find new roads";
        this.color = "Purpura";
        this.velocidad = 100;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        this.velocidad ++;
    }

    public void frenar() {
        this.velocidad --;
    }

    public static void main(String[] args) {
        Coche c1 = new Coche();
        System.out.println(c1.getVelocidad());
        c1.acelerar();
        System.out.println(c1.getVelocidad());
        c1.frenar();
        System.out.println(c1.getVelocidad());

    }
}
