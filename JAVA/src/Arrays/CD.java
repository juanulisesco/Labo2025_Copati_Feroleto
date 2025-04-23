package Arrays;
import Clase_3.Cancion;
import Clase_2.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class CD {

    private String tituloCD;
    private ArrayList <Cancion> canciones;
    private Persona autor;

    public CD() {
        this.tituloCD= "Easy money baby";
        ArrayList <Cancion> canciones = new ArrayList<>();
        Cancion tema1= new Cancion("La playa", "Myke towers");
        Cancion tema2= new Cancion("LVVC", "Myke towers");
        Cancion tema3= new Cancion("Girl", "Myke towers");
        canciones.add(tema1);
        canciones.add(tema2);
        canciones.add(tema3);
        this.autor = new Persona("Juan", 20, "El paseo de tucuman 1245");
    }

    public String getTituloCD() {

        return tituloCD;
    }

    public void setTituloCD(String tituloCD) {

        this.tituloCD = tituloCD;
    }

    public ArrayList<Cancion> getCanciones() {

        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {

        this.canciones = canciones;
    }

    public Persona getAutor() {

        return autor;
    }

    public void setAutor(Persona autor) {

        this.autor = autor;
    }

    public void cant_Canciones (){
        int suma= 0;
        for(Cancion cantidad : canciones){
            suma = suma + 1;
        }
        System.out.println("La cantidad de canciones es: " + suma);
    }

    public void verCancion(int posicion){
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un numero de la playlist y muestra la cancion: ");
        posicion= posicion - 1;
        System.out.println(canciones.get(posicion));
    }

    public void grabaCancion(int posicion, Cancion nuevaCancion){
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un numero de la playlist y muestra la cancion: ");
        int i = posicion - 1;
    }

    public void agrega(Cancion canciones){
        String nombre = "";
        String autor = "";
        this.canciones.add(new Cancion(nombre,autor));
    }

    public void elimina(int posicion){
        if (posicion >= 0 && posicion < canciones.size()) {
            Cancion eliminada = canciones.remove(posicion);
            System.out.println("Canción eliminada: " + eliminada.getTitulo());
        } else {
            System.out.println("Posición inválida. No se pudo eliminar la canción.");
        }
    }

    public static void main(String[] args) {
        CD c1 = new CD();
        CD c2 = new CD();
        Scanner e = new Scanner(System.in);
        c1.cant_Canciones();
        c2.cant_Canciones();
        c1.verCancion(1);
        c2.verCancion(2);
        c1.grabaCancion(3, ("Baby" "Justin Bieber", ));
        c2.grabaCancion(4, );
        System.out.println("Ingrese la cancion que desea incrustar:                                                                                                                                                                   ");
        String nombre= e.nextLine();
        System.out.println("Ingrese el nombre de el artista que compuso la cancion: ");
        String autor= e.nextLine();
        c1.agrega();
        c2.agrega();
        c1.elimina(5);
        c2.elimina(6);
    }
}
