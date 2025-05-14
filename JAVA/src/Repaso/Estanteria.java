package Repaso;

import java.util.ArrayList;

public class Estanteria {

    private int numDeEstanteria;
    private ArrayList<Pelicula> peliculas;

    public Estanteria(int numDeEstanteria, ArrayList<Pelicula> peliculas){

        this.numDeEstanteria=numDeEstanteria;
        peliculas.add(new Pelicula());

    }

    public Estanteria() {

        this.numDeEstanteria=12;
        peliculas.add(new Pelicula());

    }

    public int getNumDeEstanteria() {
        return numDeEstanteria;
    }

    public void setNumDeEstanteria(int numDeEstanteria) {
        this.numDeEstanteria = numDeEstanteria;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    //a)//agregar pelicula
    public void agregarP(ArrayList<Pelicula> peliculas){
        peliculas.add(new Pelicula());
    }

    //a)//eliminar pelicula
    public void borrarP (ArrayList<Pelicula> peliculas){
        peliculas.remove(new Pelicula());
    }

    //a)//modificar pelicula
    public void modP(ArrayList<Pelicula> peliculas){
        this.peliculas=peliculas;
    }

    public Pelicula mayorDuracion(){
        Pelicula aux= new Pelicula();
        for (int i= 0; i < peliculas.size(); i++){
            if (aux.getDuracion()<= peliculas.get(i).getDuracion()){
                aux= peliculas.get(i);
            }
        }
        return aux;
    }

}
