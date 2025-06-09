package Sistema_De_Vehiculos;
import Unidad_4.Ruedas.Rueda;
import Unidad_4.Colores_Codigos.Color;

public class Vehiculo extends Empresa_De_Autos{
    private String marca;
    private String modelo;
    private Color color;
    private Rueda cantidadRuedas;
    private int aniooFabricación;

    public Vehiculo(String marca, String modelo, Color color, Rueda cantidadeRuedas, int aniooFabricación){
        this.marca= marca;
        this.modelo= modelo;
        this.color= color;
        this.cantidadRuedas= cantidadeRuedas;
        this.aniooFabricación= aniooFabricación;
    }

    public int getAniooFabricación() {
        return aniooFabricación;
    }

    public Rueda getCantidadRuedas() {
        return cantidadRuedas;
    }

    public Color getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAniooFabricación(int aniooFabricación) {
        this.aniooFabricación = aniooFabricación;
    }

    public void setCantidadRuedas(Rueda cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {

    }
}
