package HashMap_y_HashSet.Control_Altura_Peso;

import Clase_2.Persona;

public class Humano extends Persona {

    private int dni;
    private int peso;
    private int altura;

    public Humano(String nombre, int edad, String apellido, int dni, int peso, int altura) {
        super(nombre, edad, apellido);
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
