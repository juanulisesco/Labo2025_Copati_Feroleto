package Alarmas_de_edificio;
import Clase_3.Fecha;
import Unidad_4.Estado.Estados;;
import java.time.LocalDate;

public class Dispositivo extends Sensor{
    private Detector_de_humo humo;
    private Sensor_de_temperatura temperatura;
    private Sensor_de_presion presion;

    public Dispositivo(boolean estado, double medida, LocalDate adquisicion, double umbralInicial, Detector_de_humo humo, Sensor_de_temperatura temperatura, Sensor_de_presion presion) {
        super(estado, medida, adquisicion, umbralInicial);
        this.humo = humo;
        this.temperatura = temperatura;
        this.presion = presion;
    }

    public Detector_de_humo getHumo() {
        return humo;
    }

    public void setHumo(Detector_de_humo humo) {
        this.humo = humo;
    }

    public Sensor_de_temperatura getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Sensor_de_temperatura temperatura) {
        this.temperatura = temperatura;
    }

    public Sensor_de_presion getPresion() {
        return presion;
    }

    public void setPresion(Sensor_de_presion presion) {
        this.presion = presion;
    }
}
