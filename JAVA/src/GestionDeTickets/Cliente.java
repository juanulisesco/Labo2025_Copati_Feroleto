package GestionDeTickets;

import java.time.LocalDate;

public class Cliente extends Persona {

    public Cliente(int dni, String nombre, String apellido,
                   LocalDate fechaN, String direccion) {
        super(dni, nombre, apellido, fechaN, direccion);
    }
}
