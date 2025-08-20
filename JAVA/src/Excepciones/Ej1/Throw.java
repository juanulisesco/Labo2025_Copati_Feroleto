package Excepciones.Ej1;

public class Throw {
    public static void nulo(){
        String nombre = null;

        try{
            if(nombre==null) {
                System.out.println(nombre.length());
                throw new NullPointerException("No se puede correr ya que nombre es nulo ");
            }
        }
        catch(NullPointerException pepe){
            System.err.println(pepe);
        }
    }

    public static void main(String[] args) {
        nulo();
    }
}

