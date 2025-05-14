package Repaso;

import Clase_2.Persona;

import java.util.ArrayList;

public class Pelicula {

    private int id;
    private String nombre;
    private String genero;
    private int duracion;
    private ArrayList<Persona> directores;
    private ArrayList<Persona> actores;
    private ArrayList<String> idiomas;

    public Pelicula(int id, String nombre, String genero, int duracion, ArrayList<Persona> directores,
                    ArrayList<Persona> actores, ArrayList<String> idiomas){

        this.id=id;
        this.nombre= nombre;
        this.genero= genero;
        this.duracion= duracion;
        directores.add(new Persona());
        actores.add(new Persona());
        idiomas.add(new String());

    }

    public Pelicula(){

        this.id= 1;
        this.nombre= "Chucky";
        this.genero= "Terror";
        this.duracion= 87;
        directores.add(new Persona());
        actores.add(new Persona());
        idiomas.add(new String());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getDirectores() {
        return directores;
    }

    public void setDirectores(ArrayList<Persona> directores) {
        this.directores = directores;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    //a)//agregar directores
    public void agregarD (Persona director){
        directores.add(director);
    }

    //a)//eliminar directores
    public void borrarD (Persona director){
        directores.remove(director);
    }

    //a)//modificar directores
    public void modD (Persona director, Persona director2){
        int aux = 0;
        for (int i=0; i < directores.size();i++){
            if(director.equals(directores.get(i))){
                aux=i;
            }
        }
        this.directores.set(aux,director2);
    }

    //a)//agregar actores
    public void agregarA (Persona actor){
        actores.add(actor);
    }

    //a)//eliminar actores
    public void borrarA (Persona actor){
        actores.remove(actor);
    }

    //a)//modificar actores
    public void modA (Persona actor, Persona actor2){
        int aux = 0;
        for (int i=0; i < actores.size();i++){
            if(actor.equals(actores.get(i))){
                aux=i;
            }
        }
        this.actores.set(aux,actor2);
    }

    //a)//agregar idioma
    public void agregarI (String idioma){
        idiomas.add(idioma);
    }

    //a)//eliminar idioma
    public void borrarI (String idioma){
        idiomas.remove(idioma);
    }

    //a)//modificar idioma
    public void modI (String idioma, String idioma2){
        int aux = 0;
        for (int i=0; i < idiomas.size();i++){
            if(idioma.equals(idiomas.get(i))){
                aux=i;
            }
        }
        this.idiomas.set(aux,idioma2);
    }

    public void actoresMayores(ArrayList<Persona>actores){
        ArrayList<Persona> aux = new ArrayList<>();
        for (int i= 0; i < actores.size(); i++){
            if (actores.get(i).getEdad()>= 18){
                aux.add(actores.get(i));
            }
        }
        System.out.println("Los actores con mayor edad son: " + aux);
    }

    public static void main(String[] args) {
        Pelicula p1 = new Pelicula();
        Persona d1= new Persona();
        Persona d2= new Persona();
        String i1= new String();
        p1.agregarD(d1);
        p1.agregarA(d2);
        p1.agregarI(i1);
        p1.borrarD(d1);
        p1.borrarA(d2);
        p1.borrarI(i1);
        p1.modD(d1, d1);
        p1.modA(d2, d2);
        p1.modI(i1, i1);
    }
}
