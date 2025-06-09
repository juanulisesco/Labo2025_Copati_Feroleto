package Unidad_4.Productos_Electronico;

public class Sonido extends Producto{
    private boolean integrado;


    public Sonido(boolean integrado, String nombre, int stock, int precio ) {
        this.integrado = integrado;
        super(nombre, stock, precio);
    }

    public void setIntegrado(boolean integrado) {
        this.integrado = integrado;
    }

}

