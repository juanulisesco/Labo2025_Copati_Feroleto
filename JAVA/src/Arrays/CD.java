package Arrays;
import Clase_3.Cancion;

import java.util.ArrayList;

public class CD {

    private String tituloCD;
    ArrayList <Cancion> canciones = new ArrayList<Cancion>();
    private String autor;

    public CD() {
        this.tituloCD= "Easy money baby";
        Cancion tema1= new Cancion("La playa", "Myke towers");
        Cancion tema2= new Cancion("LVVC", "Myke towers");
        Cancion tema3= new Cancion("Girl", "Myke towers");
        canciones.add(tema1);
        canciones.add(tema2);
        canciones.add(tema3);
        this.autor = "Myke Towers";
    }

    public String getTituloCD() {
        return tituloCD;
    }

    public void setTituloCD(String tituloCD) {
        this.tituloCD = tituloCD;
    }

    public Cancion getCanciones() {
        return canciones;
    }

    public void setCanciones(Cancion canciones) {
        this.canciones = canciones;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void cant_Canciones (){

    }
}
