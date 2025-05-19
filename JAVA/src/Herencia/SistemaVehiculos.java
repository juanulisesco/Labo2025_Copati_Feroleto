package Herencia;

public class SistemaVehiculos  {


    public SistemaVehiculos(int cant_ruedas , int añoFabricacion ) {
        super();
        this.cant_ruedas= cant_ruedas;
        this.añoFabricacion = añoFabricacion;
    }

    public SistemaVehiculos() {
        super();
        this.cant_ruedas= 6;
        this.añoFabricacion = 2000;
    }

    public int getCant_ruedas() {
        return cant_ruedas;
    }

    public void setCant_ruedas(int cant_ruedas) {
        this.cant_ruedas = cant_ruedas;
    }

    public int getAñoFabricacion(){
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion){
        this.añoFabricacion= añoFabricacion;
    }


}
