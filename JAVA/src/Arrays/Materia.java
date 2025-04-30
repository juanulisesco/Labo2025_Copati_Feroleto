package Arrays;
import java.util.ArrayList;

public class Materia {
    private String nombre;
    private ArrayList<String> listaDeContenidos;
    private ArrayList<Alumno> alumnosInscriptos;

    public Materia() {
        this.nombre = "Matematica";
        this.listaDeContenidos = new ArrayList<>();
        this.alumnosInscriptos = new ArrayList<>();

        listaDeContenidos.add("Sumas");
        listaDeContenidos.add("Multiplicaciones");
        listaDeContenidos.add("Divisiones");

        Alumno a3 = new Alumno();
        Alumno a4 = new Alumno();
        Alumno a5 = new Alumno();

        alumnosInscriptos.add(a3);
        alumnosInscriptos.add(a4);
        alumnosInscriptos.add(a5);
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
        Materia m1 = new Materia();
        Alumno alumno = new Alumno();
        m1.agregarAlumno(alumno);
        System.out.println("Promedio edad alumnos: " + m1.promedioEdadAlumnos());
        System.out.println("Promedio notas alumno: " + m1.promedioNotasAlumno(alumno));
    }
}
