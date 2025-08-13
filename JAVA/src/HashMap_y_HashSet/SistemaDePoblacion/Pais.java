package HashMap_y_HashSet.SistemaDePoblacion;

import java.util.HashSet;

public class Pais extends Lugar{

    private HashSet<Provincia> provincias;

    public Pais(String nombre, int cod, HashSet<Coordenadas> contorno,
                HashSet<Provincia> provincias) {
        super(nombre, cod, contorno);
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    int cantPoblacion(){
        int pobla=0;
        for(Provincia p : provincias){
            pobla= p.cantPoblacion();
        }
        return pobla;
    }
}
