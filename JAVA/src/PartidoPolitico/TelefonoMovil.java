package PartidoPolitico;
import Clase_2.Persona;


public abstract class TelefonoMovil extends Dispositivo1 implements Campania {
    private CompaniaTelefonica compania;
    private int numCelular;

    public TelefonoMovil(int numSerie, Persona fabricante, String modelo,
                         CompaniaTelefonica compania, int numCelular) {
        super(numSerie, fabricante, modelo);
        this.compania = compania;
        this.numCelular = numCelular;
    }
}
