package Unidad_4.Productos_Electronico;

public class Televisor extends Producto{
    private Resolucion resolucion;
    private int pixeles;

    public Televisor(Resolucion resolucion) {
        this.resolucion = resolucion;
        super(nombre, stock, precio);

    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
}
