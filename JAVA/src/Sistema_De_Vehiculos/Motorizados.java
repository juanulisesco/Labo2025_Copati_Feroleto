package Sistema_De_Vehiculos;

public class Motorizados extends Vehiculo{
    private String patente;

    public Motorizados(String patente, String marca, String modelo, String color, int cantidadeRuedas, int aniooFabricación){
        super( marca,  modelo,  color,  cantidadeRuedas,  aniooFabricación);
        this.patente= patente;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
