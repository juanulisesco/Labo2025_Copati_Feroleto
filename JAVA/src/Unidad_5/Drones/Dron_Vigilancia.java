package Unidad_5.Drones;

import Clase_3.Fecha;

public class Dron_Vigilancia extends Dron{
    private int memoria;

    public Dron_Vigilancia(String modelo, Fecha adquisicion, Estado_Dron estado, Bateria_Dron bateria, int memoria, int contador) {
        super(modelo, adquisicion, estado, bateria, contador);
        this.memoria = memoria;
    }
}
