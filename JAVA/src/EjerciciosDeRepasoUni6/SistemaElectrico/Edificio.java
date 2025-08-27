package EjerciciosDeRepasoUni6.SistemaElectrico;

import Clase_2.Persona;

import java.util.HashMap;

public class Edificio extends Vivienda {

    private int ambientes;
    private static int kw= 50;

    public Edificio(String direccion, Persona dueño, int codigoPostal, HashMap<Integer, HashMap<Meses, Consumo>> pagoConsumo, int ambientes) {
        super(direccion, dueño, codigoPostal, pagoConsumo);
        this.ambientes = ambientes;
    }

    @Override
    public int calculoConsumoMes(Meses mes, int anio){
        for (Integer a: getPagoConsumo().keySet()){
            for (Meses m: getPagoConsumo().get(a).keySet()){
            }
        }
        return 0;
    }
}
