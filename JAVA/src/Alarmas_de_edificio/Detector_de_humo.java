package Alarmas_de_edificio;
import Clase_3.Fecha;
import Unidad_4.Estado.Estados;

import java.time.LocalDate;

public class Detector_de_humo extends Dispositivo{
    public Detector_de_humo(Estados estado, double medida, double umbralInicial, Fecha añoAdquisicion) {
        super(estado, medida,umbralInicial, añoAdquisicion);
    }
    @Override
    public void dispara(){
        System.out.println("Llamar a los bomberos");
    }
}
