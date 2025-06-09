package Sistema_De_Vehiculos;
import Unidad_4.Ruedas.Rueda;
import Unidad_4.Colores_Codigos.Color;

public class Motorizados extends Vehiculo{
    private String patente;

    public Motorizados(String patente, String marca, String modelo, Color color, Rueda cantidadeRuedas, int aniooFabricación){
        super( marca,  modelo,  color,  cantidadeRuedas,  aniooFabricación);
        this.patente= patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
