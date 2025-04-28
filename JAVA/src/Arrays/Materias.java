package Arrays;
import Clase_3.Cancion;
import Clase_3.Fecha;
import java.util.ArrayList;
import java.util.Scanner;
import Arrays.Alumno;

public class Materias {
    private String nombre;
    private ArrayList<String> listaDeContenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    public Materias() {
        this.nombre = "Matematica";
        String tema1 = new String("Sumas");
        String tema2 = new String("Multiplicaciones");
        String tema3 = new String("Divisiones");
        listaDeContenidos.add(tema1);
        listaDeContenidos.add(tema2);
        listaDeContenidos.add(tema3);
        Alumno a3 = new Alumno();
        Alumno a4 = new Alumno();
        Alumno a5 = new Alumno();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getListaDeContenidos() {
        return listaDeContenidos;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public void setListaDeContenidos(ArrayList<String> listaDeContenidos) {
        this.listaDeContenidos = listaDeContenidos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(Alumno alumno) {
        this.alumnosInscriptos.add(alumno);
    }

    public double promedioEdadAlumnos() {
        int suma = 0;
        if (alumnosInscriptos.isEmpty()) {
            for (Alumno a1 : alumnosInscriptos) {
                suma += a1.obtenerEdad(a1.getFechaNacimiento());
            }
        }
        return (double) suma / alumnosInscriptos.size();
    }

    public double promedioNotasAlumno(Alumno alumno) {
        int suma = 0;
        for (Integer nota : alumno.getListaDeNotas()) {
            suma += nota;
        }
        return (double) suma / alumno.getListaDeNotas().size();
    }
    public static void main(String[] args) {
        Materias m1= new Materias();
        Alumno alumno = new Alumno();
        m1.agregarAlumno();
        m1.promedioEdadAlumnos();
        m1.promedioNotasAlumno();
    }
}
