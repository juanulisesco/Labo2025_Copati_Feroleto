package Unidad_5.Recetas;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Plato> platos;

    public void agregar (Plato plato1){
        platos.add(plato1);
    }

    public void borrar (Plato plato2){
        platos.remove(plato2);
    }

    public void modificar(Plato dsp){
        int indice = 0;
        for (int i = 0; i < platos.size(); i++) {
            if (platos.equals(platos.get(i))) {
                indice = i;
            }
        }
        platos.set(indice, dsp);
    }

    public void dificultad(){

    }
}
