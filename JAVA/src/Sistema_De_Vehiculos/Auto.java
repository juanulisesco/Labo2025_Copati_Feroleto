package Sistema_De_Vehiculos;

public class Auto extends  Motorizados{
    private boolean descapotable;

    public Auto(boolean descapotable, String patente, String marca, String modelo, String color, int cantidadeRuedas, int aniooFabricación){
        super(patente, marca,  modelo,  color,  cantidadeRuedas,  aniooFabricación);
        this.descapotable= descapotable;
    }

    public boolean getDescapotable() {
        return descapotable;
    }

    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }
}