package Sistema_de_almuerzos;
import Clase_2.Persona;
import Clase_3.Fecha;
import Colegio.Materia;

import java.util.ArrayList;
import java.time.LocalDate;

public class Alumno extends Persona {

    private ArrayList <Materia> materias;
    private ArrayList<Integer> listaDeNotas;
    private int division;

    public Alumno(){
        super();
        ArrayList<Integer> listaDeNotas = new ArrayList<>();
        Integer nota1= new Integer(10);
        Integer nota2= new Integer(6);
        Integer nota3= new Integer(3);
        listaDeNotas.add(nota1);
        listaDeNotas.add(nota2);
        listaDeNotas.add(nota3);
        this.division= 3;
    }

    public Alumno (int division){
        this.division= division;
    }

    public Alumno(String nombre, String apellido, Fecha fechaNacimiento){

        super(nombre, apellido, fechaNacimiento);

    }

    public ArrayList<Integer> getListaDeNotas() {

        return listaDeNotas;
    }

    public void setListaDeNotas(ArrayList<Integer> listaDeNotas) {

        this.listaDeNotas = listaDeNotas;
    }


    public ArrayList<Materia> getMaterias() {

        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {

        this.materias = materias;
    }

    public int getDivision() {

        return division;
    }

    public void setDivision(int division) {

        this.division = division;
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

    public void agregaMateria(Materia materia){

        this.materias.add(materia);
        materia.agregarAlumno(this);
    }

    public int obtenerEdad(Fecha fechaNacimiento){

        return LocalDate.now().getYear() - fechaNacimiento.getAnio();
    }

    public static void main(String[] args) {

        Alumno a1= new Alumno();
        Fecha f1= new Fecha( 1, 2, 2010);
        Alumno a2= new Alumno("Uli", "Copati", f1);
        a1.agregarNota(10);
        a1.menorNota();
        a1.mayorNota();

    }
}

