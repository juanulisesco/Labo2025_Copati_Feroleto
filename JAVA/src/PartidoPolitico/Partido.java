package PartidoPolitico;

import java.util.HashSet;

public class Partido {
    private String nombre;
    private String direccion;
    private HashSet<Campania> campanias;

    public Partido(String nombre, String direccion, HashSet<Trabajador> trabajadores) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void agregar (Campania m){
        campanias.add(m);
    }
    public void hacerCampania(String msg){
        for(Campania c : campanias){
            c.hacerCampania("Vote por el partido para un mejor futuro");
        }
    }
}
