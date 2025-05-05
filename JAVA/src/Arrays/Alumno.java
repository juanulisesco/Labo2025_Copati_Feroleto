package Arrays;
import Clase_3.Cancion;
import Clase_3.Fecha;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Alumno {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private ArrayList <Materias> materias;
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
    public Alumno(String nombre, String apellido, Fecha fechaNacimiento){
        this.nombre= nombre ;
        this.apellido= apellido ;
        this.fechaNacimiento= fechaNacimiento ;
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


    public ArrayList<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materias> materias) {
        this.materias = materias;
    }

    public Integer menorNota(){
        Integer menor= listaDeNotas.get(1);
        for (int i =0; i < listaDeNotas.size(); i++){
            if(menor >= listaDeNotas.get(i)){
                menor= listaDeNotas.get(i);
            }
        }
        return menor;
    }

    public void agregarNota(Integer aux){
        listaDeNotas.add(aux);
    }
    public Integer mayorNota(){
        Integer mayor= listaDeNotas.get(1);
        for (int i =0; i < listaDeNotas.size(); i++){
            if(mayor >= listaDeNotas.get(i)){
                mayor = listaDeNotas.get(i);
            }
        }
        return mayor;
    }

    public void agregaMateria(Materias materia){
        this.materias.add(materia);
        materia.agregarAlumno(this);


    }

    public int obtenerEdad(Fecha fechaNacimiento){
        return LocalDate.now().getYear() - fechaNacimiento.getAnio();
    }

    public static void main(String[] args) {
        Alumno a1= new Alumno();
        Fecha f1= new Fecha( 1, 2, 2010);
        Alumno a2= new Alumno("Uli", "Copati", f1  );
        a1.agregarNota(10);
        a1.menorNota();
        a1.mayorNota();
    }
}

