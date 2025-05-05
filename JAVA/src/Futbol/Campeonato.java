package Futbol;

import java.util.ArrayList;

public class Campeonato {
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;


    public void division() {
        this.equipos = new ArrayList<>();
        ArrayList<Equipo> turnoM = new ArrayList<>();
        ArrayList<Partido> turnoT = new ArrayList<>();
        ArrayList<Partido> turnoN = new ArrayList<>();
        for(int i = 0; i< equipos.size(); i++) {
            switch (this.equipos.get(i).getDisponibilidad()) {
                case 1:
                    turnoM.add(this.equipos.get(i));
                    break;
                case 2:
                    System.out.println("t");
                    break;
                case 3:
                    System.out.println("n");
                    break;
            }
        }
        for(int turno=0; turno<3; turno++){
            for(int i= 0; i<equipos.size()-1; i++){
                for(int w= 0; w<equipos.size()-1; w++){

                }
            }
        }
    }
}

//me quiero ir a mi casa;