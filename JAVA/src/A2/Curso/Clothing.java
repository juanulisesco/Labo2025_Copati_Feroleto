package Curso;

public class Clothing {
    String descripcion;
    double precio;
    String talle = "M";

    private final double MIN_PRECIO= 100.0;
    private final double MIN_IMPUESTO= 0.2;

    public Clothing(String descripcion, double precio, String tamanio){
        this.descripcion = descripcion;
        this.precio = precio;
        talle = tamanio;
    }

    public String getTalle() {
        return talle;
    }

    public double getPrecio() {
        return precio + (precio + MIN_IMPUESTO);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTalle(String talle) {
        this.talle = talle;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = (precio > MIN_PRECIO) ? precio : MIN_PRECIO;
    }
}
