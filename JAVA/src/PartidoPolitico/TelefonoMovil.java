package PartidoPolitico;
import Clase_2.Persona;


public abstract class TelefonoMovil extends Dispositivo1 implements Campania {
    private CompaniaTelefonica compania;
    private int numCelular;
    private int credito;

    public TelefonoMovil(int numSerie, Persona fabricante, String modelo, boolean prendido,
                         CompaniaTelefonica compania, int numCelular, int credito) {
        super(numSerie, fabricante, modelo, prendido);
        this.compania = compania;
        this.numCelular = numCelular;
        this.credito = credito;
    }

    public CompaniaTelefonica getCompania() {
        return compania;
    }

    public void setCompania(CompaniaTelefonica compania) {
        this.compania = compania;
    }

    public int getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(int numCelular) {
        this.numCelular = numCelular;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public void hacerCampania(String msg) {
        if(credito > 0 && isPrendido()){
            System.out.println("Conectando con la antena más cercana" + msg);
        }
    }
}
