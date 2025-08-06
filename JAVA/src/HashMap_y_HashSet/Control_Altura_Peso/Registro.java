package HashMap_y_HashSet.Control_Altura_Peso;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Registro {
    private HashMap<LocalDate, Humano> registro;

    public Registro(HashMap<LocalDate, Humano> registro) {
        this.registro = registro;
    }

    public HashMap<LocalDate, Humano> getRegistro() {
        return registro;
    }

    public void setRegistro(HashMap<LocalDate, Humano> registro) {
        this.registro = registro;
    }

    public void VerRegistroPorFecha(LocalDate fecha){
        for (LocalDate l: registro.keySet()){
            if (l== fecha){
                System.out.println("La persona: " + registro.get(l).getDni() + "mide y pesa: " + registro.get(l).getPeso() + registro.get(l).getAltura());
            }
        }
    }

    public void PromedioPesoYAltura(int anio){
        int altura= 0;
        int numero=0;
        int peso= 0;
        for (LocalDate l: registro.keySet()){
            if (l.getYear() == anio){
                altura= altura + registro.get(l).getAltura();
                numero++;
                peso= peso + registro.get(l).getPeso();
            }
        }
        altura= altura / numero;
        peso= peso / numero;
        System.out.println("La altura y peso promedio del anio: " + anio + ", es de: " + peso + altura);
    }

    public void PorcentajeCrecimiento(LocalDate fecha1, LocalDate fecha2){
        double porcentaje = 0;
        int aux = 0;
        for (LocalDate l: registro.keySet()){
            if(l.isAfter(fecha1) && l.isBefore(fecha2)){
                for (Humano h : registro.values()) {
                    aux ++;
                    porcentaje = porcentaje + registro.get(h).getAltura();
                    porcentaje = porcentaje / aux;
                }
            }
        }
    }
}
