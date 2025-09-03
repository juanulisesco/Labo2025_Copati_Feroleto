package Excepciones;

public class ClasePersonalizada extends Exception {
    public ClasePersonalizada(String mensaje) {
        super(mensaje);
    }
    public static void main(String[] args) {
        String nombre = null;

        try {
            validarNombre(nombre);
            System.out.println("El largo del nombre es: " + nombre.length());
        } catch (ClasePersonalizada e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        }

        System.out.println("Firma: Juan Pérez");
    }

    public static void validarNombre(String nombre) throws ClasePersonalizada {
        if (nombre == null) {
            throw new ClasePersonalizada("El nombre es null y no puede procesarse.");
        }
    }
}
