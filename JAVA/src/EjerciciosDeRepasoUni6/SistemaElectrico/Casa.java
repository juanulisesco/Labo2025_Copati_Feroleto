package EjerciciosDeRepasoUni6.SistemaElectrico;

import Clase_2.Persona;

import java.util.ArrayList;
import java.util.HashMap;

public class Casa extends Vivienda {

    private int metrosCub1;
    private int metrosCub2;
    private static int kw= 100;

    public Casa(String direccion, Persona dueño, int codigoPostal, HashMap<Integer, HashMap<Meses, Consumo>> pagoConsumo, int metrosCub1, int metrosCub2) {
        super(direccion, dueño, codigoPostal, pagoConsumo);
        this.metrosCub1 = metrosCub1;
        this.metrosCub2 = metrosCub2;
    }

    @Override
    public int calculoConsumoMes(Meses mes, int anio) {
        return 0;
    }
}
