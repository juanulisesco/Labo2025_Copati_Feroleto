package Exepciones.Ejericio1FragmentosCodigos;

public class Throws extends Exception{
    public static int nulo(String nombre) throws Exception{
        return nombre.length();
    }

    public static void main(String[] args) {
        try{
            nulo(null);
        }
        catch (Exception e){
            System.out.println("Error porque el nombre es nulo" + e);
        }
    }
}
