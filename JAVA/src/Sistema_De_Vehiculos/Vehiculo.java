package Sistema_De_Vehiculos;

public class Vehiculo extends Sistema{
    private String marca;
    private String modelo;
    private String color;
    private int cantidadRuedas;
    private int aniooFabricación;

    public Vehiculo(String marca, String modelo, String color, int cantidadeRuedas, int aniooFabricación){
        this.marca= marca;
        this.modelo= modelo;
        this.color= color;
        this.cantidadRuedas= cantidadeRuedas;
        this.aniooFabricación= aniooFabricación;
    }

    public int getAniooFabricación() {
        return aniooFabricación;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public String getColor() {
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

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public void setColor(String color) {
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
