package Alarmas_de_edificio;
import Clase_3.Fecha;
import Unidad_4.Estado.Estados;;

public class Dispositivo {
    private Estados estado;
    private double medida;
    private double umbralI ;
    private Fecha añoAdquisicion;

    public Dispositivo(Estados estado, double medida, double umbralI , Fecha añoAdquisicion){
        this.estado= estado;
        this.medida=medida;
        this.umbralI=umbralI;
        this.añoAdquisicion= new Fecha();
    }

    public Dispositivo(){
        this.estado=estado  ;
        this.medida= 4.2;
        this.umbralI= 2.1;
        this.añoAdquisicion= new Fecha(12, 10,2007);
    }

    public Estados isEstado() {
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

    public void setEstado(Estados estado) {
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

}

