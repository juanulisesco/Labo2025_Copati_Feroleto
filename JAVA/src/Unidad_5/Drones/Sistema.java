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
        double lat1Rad = Math.toRadians(dron.getLatitud());
        double lon1Rad = Math.toRadians(dron.getLongitud());
        double lat2Rad = Math.toRadians(lati);
        double lon2Rad = Math.toRadians(longi);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        radioTierraKm= radioTierraKm * c;
        Bateria_Dron[] baterix= Bateria_Dron.values();

        if(radioTierraKm >= 30){
            if(dron.getBateria().getNum() >= 50){
                for (int i = 0; i < cargueros.size(); i++) {
                    if (cargueros.get(i).equals(dron)){
                        for(int j = 0; j<baterix.length; j++){
                            if(cargueros.get(i).getBateria() == baterix[j]){
                                // cargueros.get(i).getBateria()= baterix[j - 5];
                            }
                        }
                    }
                }
            }
            else {
                System.out.println("El dron no tiene la bateria suficiente para realizar la msion");
            }
        }
        else {
            for (int i = 0; i < cargueros.size(); i++) {
                if (cargueros.get(i).equals(dron)){
                }
            }
        }
    }
    public void misionVigilantes(double longi, double lati, Dron_Vigilancia dron){
        double lat1Rad = Math.toRadians(dron.getLatitud());
        double lon1Rad = Math.toRadians(dron.getLongitud());
        double lat2Rad = Math.toRadians(lati);
        double lon2Rad = Math.toRadians(longi);

        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double radioTierraKm = 6371;
        radioTierraKm= radioTierraKm * c;
        double aux= 0;
        double aux2= 0;
        if(dron.getMemoria() == 0){
            System.out.println("El dron no tiene memoria");
        }
        else {
            aux= radioTierraKm / 2.0;
            aux2= aux * 12;
            for(int i= 0; i<vigilantes.size(); i++){
                if (vigilantes.get(i).equals(dron)){
                    if (vigilantes.get(i).getMemoria() <= aux2){
                        System.out.println("No hay memoria suficiente para sacar las fotos");
                    }
                    else {
                        //vigilantes.get(i).getMemoria()= vigilantes.get(i).getMemoria() - aux2;
                        System.out.println("Las fotos fueron sacadas y quedna" + vigilantes.get(i).getMemoria());
                    }
                }
            }
        }
    }
}
