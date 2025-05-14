package Figuras;

public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
        this.base = 4;
        this.altura = 15;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {

        this.base = base;
    }

    public double getAltura() {

        return this.altura;
    }

    public void setAltura(double altura) {

        this.altura = altura;
    }

    public double perimetro() {
        double perimetro = 2 * this.base + 2 * this.altura;
        return perimetro;
    }

    public double area() {
        double area = this.base * this.altura;
        return area;
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo();
        r1.area();
        r1.perimetro();
        System.out.println(r1.getAltura());
        System.out.println(r1.getBase());
    }
}
