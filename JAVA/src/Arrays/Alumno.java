package Arrays;
import Clase_3.Cancion;
import Clase_3.Fecha;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Integer> listaDeNotas;

    public Alumno(){
        this.nombre= "María" ;
        this.apellido= "Santa" ;
        this.fechaNacimiento= new Fecha(10, 10, 2020);
        ArrayList<Integer> listaDeNotas = new ArrayList<>();
        Integer nota1= new Integer(10);
        Integer nota2= new Integer(6);
        Integer nota3= new Integer(3);
        listaDeNotas.add(nota1);
        listaDeNotas.add(nota2);
        listaDeNotas.add(nota3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public ArrayList<Integer> getListaDeNotas() {
        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Integer> listaDeNotas) {
        this.listaDeNotas = listaDeNotas;
    }
}

