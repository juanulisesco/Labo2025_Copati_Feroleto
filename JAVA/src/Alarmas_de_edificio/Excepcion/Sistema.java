package Alarmas_de_edificio.Excepcion;
import Alarmas_de_edificio.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema extends Exception{
    public ArrayList<Sensor> sensores;

    public Sistema(ArrayList<Sensor> sensores) {
        this.sensores = sensores;
    }
    public Sistema() {
        this.sensores = new ArrayList<>();
    }

    public void comparar() {
        double total=0;
        String mensaje=" ";
        for (Sensor s : sensores) {
            if (s instanceof Dispositivo) {
                total=((Dispositivo) s).getHumo().getMedida()+((Dispositivo)
                        s).getPresion().getMedida()+((Dispositivo)
                        s).getTemperatura().getMedida();
                if(total>s.getUmbralInicial()){
                    mensaje="Ya no hay nada que podamos hacer";
                    System.out.println(mensaje);
                }
            } else {
                if (s.getMedida() > s.getUmbralInicial()) {
                    if (s instanceof Detector_de_humo) {
                        dispara();
                    } else if (s instanceof Sensor_de_temperatura) {
                        dispara();
                    } else if (s instanceof Sensor_de_presion) {
                        s.dispara();
                    }
                }
            }
            System.out.println(mensaje);
        }
    }
    public void dispara(){
    }

    public static void main(String[] args) {
        Sistema a1 = new Sistema();
        a1.comparar();
        int numero= 0;
        try {
            System.out.println("Ingrese el numero del sensor que desee");
            for (int i = 0; i < a1.sensores.size(); i++) {
                System.out.println(i + ")" + a1.sensores.get(i).getEstado());
            }
            Scanner e = new Scanner(System.in);
            numero = e.nextInt();
        }
        catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Ocurrio alguna excepcion");
        }
    }
}
