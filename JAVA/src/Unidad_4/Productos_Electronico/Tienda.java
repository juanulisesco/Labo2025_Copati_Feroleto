package Unidad_4.Productos_Electronico;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos= new ArrayList<>();

    public Tienda(){
        this.productos=new ArrayList<>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
}
