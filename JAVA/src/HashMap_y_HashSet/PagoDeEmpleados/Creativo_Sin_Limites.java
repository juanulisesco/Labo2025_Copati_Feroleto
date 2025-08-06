package HashMap_y_HashSet.PagoDeEmpleados;

import java.util.HashMap;

public class Creativo_Sin_Limites {
    private HashMap<Proyecto, Diseñador> proyectos;

    public Creativo_Sin_Limites(HashMap<Proyecto, Diseñador> proyectos) {
        this.proyectos = proyectos;
    }

    public HashMap<Proyecto, Diseñador> getProyectos() {
        return proyectos;
    }

    public void setProyectos(HashMap<Proyecto, Diseñador> proyectos) {
        this.proyectos = proyectos;
    }

    public void VerSueldo(Diseñador diseñador){
        double ganancia= 0;
        for(Proyecto p: proyectos.keySet()){
            if (proyectos.get(p).getDni()== diseñador.getDni()){
                ganancia= ganancia + p.getGanancia();
            }
        }
        ganancia= ganancia + ganancia * diseñador.getTipo().getComision();
        System.out.println("El salario del diseñador es de: " + ganancia);

    }
    public void CantidadProyectos(Diseñador diseñador){
        int cantidad= 0;
        for(Proyecto p: proyectos.keySet()){
            if(proyectos.get(p).getDni()== diseñador.getDni()){
                cantidad++;
            }
        }
        System.out.println("La cantidad de proyectos realizados por "+ diseñador.getDni() + "son: " + cantidad);
    }

    public void GananciaSinComision(Proyecto proyecto){
        for(Proyecto p: proyectos.keySet()){
            if (p == proyecto){
                System.out.println("La ganancia del proyecto sin comision es de: " + p.getGanancia());
            }
        }
    }

    public void SueldoDiscriminado(){
        double aux=0;
        for(Proyecto p : proyectos.keySet()){
            aux= aux + p.getGanancia() * proyectos.get(p).getTipo().getComision();
            System.out.println("Mostramos el nombre del proyecto:" +
                    p.getNombre() + ", generó: " + p.getGanancia() + ", y la comision es de :" + aux);
        }
    }
}
