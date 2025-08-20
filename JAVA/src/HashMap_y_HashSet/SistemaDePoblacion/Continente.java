package HashMap_y_HashSet.SistemaDePoblacion;

import java.util.HashSet;

public class Continente extends Lugar {
    private HashSet<Pais> paises;

    public Continente() {
        super();
        this.paises = paises;
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }


    int cantPoblacion(){
        int pobla=0;
        for(Pais pa : paises){
            pobla= pa.cantPoblacion();
        }
        return pobla;

    }
}