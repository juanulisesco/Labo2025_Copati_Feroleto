package HashMap_y_HashSet.SistemaDePoblacion;

import java.util.HashSet;
import java.util.Optional;

public class Mundo {
    private HashSet<Lugar>lugares;
    private HashSet<Continente>continentes;

    public Mundo(HashSet<Lugar> lugares, HashSet<Continente> continentes) {
        this.lugares = lugares;
        this.continentes = continentes;
    }

    public HashSet<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(HashSet<Lugar> lugares) {
        this.lugares = lugares;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public void agregarLugares(Lugar lugar1){
        lugares.add(lugar1);
    }

    public void borarrLugares(Lugar lugar1){
        lugares.add(lugar1);
    }

    public void modificarLugares(Lugar nuevoLugar) {
        lugares.add(nuevoLugar);
    }

    public int ConsultarPoblacion(int cod){
        int total=0;
        for (Lugar l: lugares){
            if(l.getCod()==cod){
                total=l.cantPoblacion();
            }
        }
        return total;
    }

    public Continente ContMas(){
        int total=0;
        Continente c = new Continente();
        for (Continente c1:continentes){
            if(c.cantPoblacion()>total){
                c=c1;
                total=c1.cantPoblacion();

            }
        }
        return c;
    }
    public Continente ContMenos() {
        int total = 0;
        Continente co = new Continente();
        for (Continente cont : continentes) {
            if (cont.cantPoblacion() < total) {
                co = cont;
                total = co.cantPoblacion();

            }
        }
        return co;
    }
}
