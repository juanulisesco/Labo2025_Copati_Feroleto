package Unidad_4.Productos_Electronico;

public class Cargador extends Producto{
    private int carga;

    public Cargador(String nombre, int precio, int stock, int carga){
        super(nombre,precio, stock);
        this.carga= carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
