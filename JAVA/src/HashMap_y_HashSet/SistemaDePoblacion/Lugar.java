package HashMap_y_HashSet.SistemaDePoblacion;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int cod;
    private HashSet<Coordenadas> contorno;

    public Lugar(String nombre, int cod, HashSet<Coordenadas> contorno) {
        this.nombre = nombre;
        this.cod = cod;
        this.contorno = contorno;
    }

    public Lugar() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public HashSet<Coordenadas> getContorno() {
        return contorno;
    }

    public void setContorno(HashSet<Coordenadas> contorno) {
        this.contorno = contorno;
    }

    abstract int cantPoblacion();
}
