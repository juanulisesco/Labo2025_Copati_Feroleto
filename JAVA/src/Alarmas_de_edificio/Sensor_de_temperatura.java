package Alarmas_de_edificio;

import Clase_3.Fecha;
import Unidad_4.Estado.Estados;

public class Sensor_de_temperatura extends Dispositivo {
    public Sensor_de_temperatura(Estados estado, double medida, double umbralInicial, Fecha añoAdquisicion) {
        super(estado, medida, umbralInicial, añoAdquisicion);
    }

    public void dispara(){
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
