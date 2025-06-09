package Alarmas_de_edificio;
import Clase_3.Fecha;
import Unidad_4.Estado.Estados;

import java.time.LocalDate;
public class Sensor_de_presion extends Dispositivo {

    public Sensor_de_presion(Estados estado, double medida, double umbralInicial, Fecha añoAdquisicion) {
        super(estado, medida, umbralInicial, añoAdquisicion);
    }

    public void dispara(){
        System.out.println("Sensor de presión activado");
    }
}
