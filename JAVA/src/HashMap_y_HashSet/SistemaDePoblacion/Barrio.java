package HashMap_y_HashSet.SistemaDePoblacion;

import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int cod, HashSet<Coordenadas> contorno, int poblacion) {
        super(nombre, cod, contorno);
        this.poblacion = poblacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    int cantPoblacion(){
        return poblacion;
    }

}
