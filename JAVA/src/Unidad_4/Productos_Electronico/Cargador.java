package Unidad_4.Productos_Electronico;

public class Cargador extends Producto{
    private int carga;

    public Cargador(int carga, String nombre, int stock, int precio){
        this.carga= carga;
        super(nombre, stock, precio);
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
