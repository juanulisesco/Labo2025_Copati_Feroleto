package HashMap_y_HashSet.SistemaDePoblacion;

import Repaso.Estanteria;

import java.util.HashSet;

public class Ciudad extends Lugar {
    private HashSet<Barrio> barrios;

    public Ciudad(String nombre, int cod, HashSet<Coordenadas> contorno,
                     HashSet<Barrio> barrios) {
        super(nombre, cod, contorno);
        this.barrios = barrios;
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    int cantPoblacion(){
        int pobla=0;
        for(Barrio b : barrios){
            pobla= b.cantPoblacion();
        }
        return pobla;
    }
}
