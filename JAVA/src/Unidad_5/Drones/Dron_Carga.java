package Unidad_5.Drones;

import Clase_3.Fecha;

public class Dron_Carga extends Dron{
    private int carga;

    public Dron_Carga(String modelo, Fecha adquisicion, Estado_Dron estado, Bateria_Dron bateria, int carga, int contador){
        super(modelo, adquisicion, estado, bateria, contador);
        this.carga= carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
}
