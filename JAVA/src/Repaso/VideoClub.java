package Repaso;

import java.util.ArrayList;

public class VideoClub {

    private String direccion;
    private int codPostal;
    private ArrayList<Estanteria> estanterias;

    public VideoClub(String direccion, int codPostal, ArrayList<Estanteria> estanterias) {

        this.direccion = direccion;
        this.codPostal = codPostal;
        estanterias.add(new Estanteria());

    }

    public VideoClub() {

        this.direccion= "Av. Mosconi 4267";
        this.codPostal= 1914;
        estanterias.add(new Estanteria());

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public ArrayList<Estanteria> getEstanterias() {
        return estanterias;
    }

    public void setEstanterias(ArrayList<Estanteria> estanterias) {
        this.estanterias = estanterias;
    }

    //a)//agregar estanterias
    public void agregarE (Estanteria estanteria1){
        estanterias.add(estanteria1);
    }

    //a)//eliminar estanterias
    public void borrarE (Estanteria estanteria1){
        estanterias.remove(estanteria1);
    }

    //a)//modificar estanterias
    public void modE (Estanteria estanteria) {
        int aux = 0;
        for (int i = 0; i < estanterias.size(); i++) {
            if (estanteria.equals(estanterias.get(i))) {
                aux = i;
            }
        }
        this.estanterias.set(aux, estanteria);
    }

    public void masEstanteria(){
        Estanteria aux= new Estanteria();
        int aux1 = 0;
        for(int i = 0; i< estanterias.size(); i++){
            if(estanterias.get(i).getPeliculas().equals(aux.mayorDuracion())){
                aux1=estanterias.get(i).getNumDeEstanteria();
            }
        }
        System.out.println("La pelicula con mayor duracion es: " + aux.mayorDuracion().getNombre() +
                "Y se encuentra en la estanteria: " + aux1);
    }

    public static void main(String[] args) {
        VideoClub v1 = new VideoClub();
        Estanteria e1 = new Estanteria();
        Estanteria e2 = new Estanteria();
        Estanteria e3 = new Estanteria();
        v1.agregarE(e1);
        v1.borrarE(e2);
        v1.modE(e3);
        v1.masEstanteria();
    }
}
