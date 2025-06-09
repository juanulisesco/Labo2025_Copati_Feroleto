package Sistema_De_Vehiculos;
import Unidad_4.Colores_Codigos.Color;
import Unidad_4.Ruedas.Rueda;

public class Camioneta extends Motorizados{
    private int capacidad;
    private int capacidadmax;

    public Camioneta(int capacidad, int capacidadmax, String patente, String marca, String modelo,
                     Color color, Rueda cantidadeRuedas, int aniooFabricación){
        super(patente, marca,  modelo,  color,  cantidadeRuedas,  aniooFabricación);
        this.capacidad= capacidad;
        this.capacidadmax= capacidadmax;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getCapacidadmax() {
        return capacidadmax;
    }

    public void setCapacidadmax(int capacidadmax) {
        this.capacidadmax = capacidadmax;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}