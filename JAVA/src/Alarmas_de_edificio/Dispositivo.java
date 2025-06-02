package Alarmas_de_edificio;
import Clase_3.Fecha;

public class Dispositivo {
    private boolean estado;
    private double medida;
    private double umbralI ;
    private Fecha añoAdquisicion;

    public Dispositivo(boolean estado, double medida, double umbralI , Fecha añoAdquisicion){
        this.estado= estado;
        this.medida=medida;
        this.umbralI=umbralI;
        this.añoAdquisicion= new Fecha();
    }

    public Dispositivo(){
        this.estado= true ;
        this.medida= 4.2;
        this.umbralI= 2.1;
        this.añoAdquisicion= new Fecha(12, 10,2007);
    }

    public boolean isEstado() {
        return estado;
    }

    public double getMedida() {
        return medida;
    }

    public double getUmbralI() {
        return umbralI;
    }

    public Fecha getAñoAdquisicion() {
        return añoAdquisicion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public void setUmbralI(int umbralI) {
        this.umbralI = umbralI;
    }

    public void setAñoAdquisicion(Fecha añoAdquisicion) {
        this.añoAdquisicion = añoAdquisicion;
    }

    public boolean estaActivo(boolean estado){
        if (isEstado()){
            return true;
        }
        else
            return false;
    }

    public void tomarMedidas(){

    }
}

