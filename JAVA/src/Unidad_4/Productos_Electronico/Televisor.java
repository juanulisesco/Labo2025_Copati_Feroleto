package Unidad_4.Productos_Electronico;

public class Televisor extends Producto{
    private Resolucion resolucion;
    private int pixeles;

    public Televisor(String nombre, int precio, int stock, Resolucion resolucion) {
        super(nombre, stock, precio);
        this.resolucion = resolucion;

    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
}
