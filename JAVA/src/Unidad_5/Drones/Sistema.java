package Unidad_5.Drones;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Dron_Carga> cargueros;
    private ArrayList<Dron_Vigilancia> vigilantes;

    public Sistema(ArrayList<Dron_Carga> cargueros, ArrayList<Dron_Vigilancia> vigilantes) {
        cargueros = cargueros;
        vigilantes = vigilantes;
    }

    public ArrayList<Dron_Carga> getCargueros() {
        return cargueros;
    }

    public void setCargueros(ArrayList<Dron_Carga> cargueros) {
        cargueros = cargueros;
    }

    public ArrayList<Dron_Vigilancia> getVigilantes() {
        return vigilantes;
    }

    public void setVigilantes(ArrayList<Dron_Vigilancia> vigilantes) {
        vigilantes = vigilantes;
    }

    public void misionCargas(double longi, double lati, Dron_Carga dron){
        
        if(dron.getBateria().getNum() >= 50){
            for (int i = 0; i < cargueros.size(); i++) {
                if (cargueros.get(i).equals(dron)){

                }
            }
        }
        else {
            System.out.println("El dron no tiene la bateria suficiente para realizar la msion");
        }
    }
}
