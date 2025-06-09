package Sistema_de_llamadas;
import Clase_3.Fecha;
public class Persona1 {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private int edad;
    private String direccion;

    public Persona1() {
        this.nombre = "Selene";
        this.apellido= "Santa" ;
        this.fechaNacimiento= new Fecha(10, 10, 2020);
        this.edad = 17;
        this.direccion = "Av Mosconi 7000";
    }

    public Persona1(String nombre,String apellido ) {
        this.nombre = nombre;
        this.apellido= apellido;
    }

    public Persona1(String nombre, int edad, String apellido ) {
        this.nombre = nombre;
        this.edad= edad;
        this.apellido= apellido;
    }

    public Persona1(String nombre, int edad, String apellido,
                   Fecha fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido= apellido;
        this.fechaNacimiento= fechaNacimiento;
        this.direccion = direccion;
    }

    public Persona1(String nombre, String apellido, Fecha fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido= apellido;
    }

    public String getNombre() {

        return this.nombre;
    }

    public int getEdad() {

        return this.edad;
    }

    public String getApellido() {

        return apellido;
    }

    public Fecha getFechaNacimiento() {

        return fechaNacimiento;
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

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {

        this.fechaNacimiento = fechaNacimiento;
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
        Persona1 p1 = new Persona1();
        p1.imprimir();
    }
}
