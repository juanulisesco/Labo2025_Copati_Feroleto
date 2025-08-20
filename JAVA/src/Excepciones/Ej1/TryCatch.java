package Excepciones.Ej1;

public class TryCatch {
    public static void main(String[] args) {
        String nombre = null;
        try{
            System.out.println(nombre.length());
        }
        catch(NullPointerException pepe){
            System.out.println("El nombre esta en null osea no tiene valores");
        }
    }
}
