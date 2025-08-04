package HashMap_y_HashSet.Vacunatorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Local {
    HashMap<Integer, Ciudadano> Vacunadas;

    public Local(HashMap<Integer, Ciudadano> vacunadasPerso) {
        Vacunadas = vacunadasPerso;
    }

    public HashMap<Integer, Ciudadano> getVacunadasPerso() {
        return Vacunadas;
    }

    public void setVacunadasPerso(HashMap<Integer, Ciudadano> vacunadasPerso) {
        Vacunadas = vacunadasPerso;
    }
    public void AgregarVacunadas(Vacuna vac){
        ArrayList<Integer> personas = new ArrayList<>();
        for(Integer Dni: Vacunadas.keySet()) {
            Vacunadas.get(Dni).getVacunas().add(vac);
        }
    }

    public void VacunasPorDni(int dNI){
        for (Vacuna v: Vacunadas.get(dNI).getVacunas()){
            System.out.println(v.getNombre());
        }
    }

    public void VacunasPorProvincia(){
        HashMap<String, Integer> vacPorProvincia= new HashMap<>();
        for (Integer Dni: Vacunadas.keySet()){
            String p = Vacunadas.get(Dni).getProcedencia();
            if(vacPorProvincia.containsKey(p)){
                Integer cantPer= vacPorProvincia.get(p);
                vacPorProvincia.replace(p, cantPer, cantPer+1);
            }
            else{
                vacPorProvincia.put(p,1);
            }
        }
        for(Map.Entry<String, Integer> aux: vacPorProvincia.entrySet()){
            String provincia= aux.getKey();
            Integer cantidad= aux.getValue();
            System.out.println("Provincia: " + provincia + "Cantidad de personas: " + cantidad);
        }
    }

    public void VacunasPorCantidad(int cantidad){
        ArrayList<Integer> personas = new ArrayList<>();
        for(Integer Dni: Vacunadas.keySet()){
            int cantidadVacunas= Vacunadas.get(Dni).getVacunas().size();
            if (cantidadVacunas== cantidad){
                personas.add(Dni);
            }
        }
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    public void PersonasVacunadas(Vacuna vac){
        ArrayList<Integer> personas = new ArrayList<>();
        for(Integer Dni: Vacunadas.keySet()){
            if (Vacunadas.get(Dni).getVacunas().contains(vac)){
                personas.add(Dni);
            }
        }
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }
}
