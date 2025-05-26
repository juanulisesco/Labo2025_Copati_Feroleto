package Sistema_De_Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa_De_Autos{
    private ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    private ArrayList<Camioneta> camionetas = new ArrayList<>();
    private ArrayList<Auto> autos = new ArrayList<>();

    void Empresa_De_Autos(){

    }

    public ArrayList<Auto> getAutos() {
        return autos;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public ArrayList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setBicicletas(ArrayList<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }

    public void setAutos(ArrayList<Auto> autos) {
        this.autos = autos;
    }

    public void setCamionetas(ArrayList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    public void cantidad(){
        int cantidadMaxAuto = 0;
        int cantidadMaxBici = 0;
        int cantidadMaxCamion = 0;
        for(int i = 0; i<autos.size(); i++){
            cantidadMaxAuto = cantidadMaxAuto + 1;
        }

        for(int i = 0; i<bicicletas.size(); i++){
            cantidadMaxBici = cantidadMaxBici + 1;
        }

        for(int i = 0; i<camionetas.size(); i++){
            cantidadMaxCamion = cantidadMaxCamion + 1;
        }
        if(cantidadMaxAuto >= cantidadMaxBici && cantidadMaxAuto >= cantidadMaxCamion){
            System.out.println("La mayor cantdad de vehiculos en la concesionaria son autos");
        }

        else if(cantidadMaxAuto <= cantidadMaxBici && cantidadMaxBici >= cantidadMaxCamion){
            System.out.println("La mayor cantdad de vehiculos en la concesionaria son las bicicletas");
        }

        if(cantidadMaxCamion >= cantidadMaxBici && cantidadMaxAuto <= cantidadMaxCamion){
            System.out.println("La mayor cantdad de vehiculos en la concesionaria son los camionetas");
        }
    }

    public void AniadirCarga(String patente){
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de peso para aniadirle a la camioneta con la patente: " + patente);
        int aux = e.nextInt();
        for(int i = 0; i< camionetas.size(); i++){
            if(camionetas.get(i).getPatente().equals(patente)){
                int capacamio = camionetas.get(i).getCapacidad();
                aux = aux + capacamio;
                if(capacamio >= camionetas.get(i).getCapacidadmax()){
                    System.out.println("No se le puede aniadir esa capacidad porque supera la capacidad maxima");
                }
                else{
                    camionetas.get(i).setCapacidad(aux);
                }
            }
        }
    }

    public void porcentajeDescapo(){
        int porcen = 0;
        int descapocant =0;
        int autoscant = 0;
        for(int i = 0; i<autos.size(); i++){
            if(autos.get(i).getDescapotable()){
                descapocant = descapocant + 1;
            }
            autoscant = autoscant + 1;
        }
        porcen = descapocant / 100 * autoscant;
        System.out.println("El porcentaje de autos descapotables son: " + porcen + "%");
    }
}
