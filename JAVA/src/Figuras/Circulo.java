package Figuras;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {

        this.radio = (double)2.0F;

    }

    public Circulo(double radio) {

        this.radio = radio;

    }

    public double getRadio() {

        return this.radio;

    }

    public void setRadio(double radio) {

        this.radio = radio;

    }

    public double area() {

        double area = Math.PI * radio * radio;
        return area;

    }

    public double perimetro() {

        double perimetro = (Math.PI * 2D) * radio;
        return perimetro;

    }

    public static void main(String[] args) {
        Circulo c1 = new Circulo((double)8.0F);
        Circulo c2 = new Circulo();
        c1.area();
        c2.area();
        c1.perimetro();
        c2.perimetro();
        System.out.println(c1.getRadio());
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        System.out.println(c2.getRadio());
        System.out.println(c2.area());
        System.out.println(c2.perimetro());
    }
}
