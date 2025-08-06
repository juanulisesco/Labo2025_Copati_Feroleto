package HashMap_y_HashSet.PagoDeEmpleados;

import Clase_2.Persona;

import java.util.HashMap;

public class Diseñador extends Persona {

    private int dni;
    private TipoDiseñador tipo;

    public Diseñador(int dni, String nombre, String apellido, String direccion, TipoDiseñador tipo, double comision) {
        super(nombre, apellido, direccion);
        this.tipo = tipo;

        this.dni = dni;
    }

    public TipoDiseñador getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiseñador tipo) {
        this.tipo = tipo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
