package Sistema_De_Vehiculos;

public class Vehiculo_Con_Patente extends  Vehiculo{
    private String patente;

    public Vehiculo_Con_Patente(String patente, String marca, String modelo, String color, int cantidadeRuedas, int aniooFabricación){
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
