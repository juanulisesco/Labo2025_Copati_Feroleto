package Unidad_4.Productos_Electronico;

public class Sonido extends Producto{
    private boolean integrado;


    public Sonido(boolean integrado, String nombre, int stock, int precio ) {
        super(nombre, stock, precio);
        this.integrado = integrado;
    }

    public void setIntegrado(boolean integrado) {
        this.integrado = integrado;
    }

}

