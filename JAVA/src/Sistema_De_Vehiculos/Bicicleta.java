package Sistema_De_Vehiculos;
import Unidad_4.Ruedas.Rueda;
import Unidad_4.Colores_Codigos.Color;

public class Bicicleta extends Vehiculo{

    public Bicicleta(String marca, String modelo, Color color, Rueda cantidadeRuedas, int aniooFabricación){
        super( marca,  modelo,  color,  cantidadeRuedas,  aniooFabricación);
    }
}