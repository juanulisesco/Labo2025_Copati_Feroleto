package HashMap_y_HashSet.SistemaDePoblacion;

import java.util.HashSet;

public class Provincia extends Lugar{
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, int cod, HashSet<Coordenadas> contorno,
                     HashSet<Ciudad> ciudades) {
        super(nombre, cod, contorno);
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    int cantPoblacion(){
        int pobla=0;
        for(Ciudad c : ciudades){
            pobla= c.cantPoblacion();
        }
        return pobla;
    }

}
