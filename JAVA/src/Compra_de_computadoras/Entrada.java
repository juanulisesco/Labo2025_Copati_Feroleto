import Compra_de_computadoras.Perisferico;
import java.util.ArrayList;

public class Entrada extends Perisferico {
    private ArrayList<String> conectores;

    public Entrada(String fabricante, String modelo, double precioBase, int stock,
                   ArrayList<String> puertos, ArrayList<String> conectores) {
        super(fabricante, modelo, precioBase, stock, puertos);
        this.conectores = conectores;
    }
    public Entrada() {
        super();
        this.conectores = new ArrayList<>();
    }

    public ArrayList<String> getConectores() {
        return conectores;
    }

    public void setConectores(ArrayList<String> conectores) {
        this.conectores = conectores;
    }
}
