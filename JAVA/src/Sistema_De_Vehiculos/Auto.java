package Sistema_De_Vehiculos;
import Unidad_4.Ruedas.Rueda;
import Unidad_4.Colores_Codigos.Color;

public class Auto extends Motorizados{
    private boolean descapotable;

    public Auto(String patente, String marca, String modelo, Color color, Rueda cantidadeRuedas,
                int aniooFabricación, boolean descapotable) {
        super(patente, marca, modelo, color, cantidadeRuedas, aniooFabricación);
        this.descapotable = descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}