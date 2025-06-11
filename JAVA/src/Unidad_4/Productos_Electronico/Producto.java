package Unidad_4.Productos_Electronico;

public class Producto {
    private String nombre;
    private int precio;
    private int stock;
    private Seccion secion;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void producto(){
        this.secion=Seccion.MULTIMEDEA;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSecion(Seccion secion) {
        this.secion = secion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
