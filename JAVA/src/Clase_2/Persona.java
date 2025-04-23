package Clase_2;

public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public Persona() {
        this.nombre = "Selene";
        this.edad = 17;
        this.direccion = "Av Mosconi 7000";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 20;
        this.direccion = "av constituyentes 1213";
    }

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void imprimir() {
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.direccion);
    }

    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.imprimir();
    }
}
