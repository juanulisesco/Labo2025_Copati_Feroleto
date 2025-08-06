package HashMap_y_HashSet.PagoDeEmpleados;

public class Proyecto {
    private int numero;
    private String nombre;
    private double ganancia;

    public Proyecto(Diseñador diseñador, int numero, String nombre, double ganancia) {

        this.numero = numero;
        this.nombre = nombre;
        this.ganancia = ganancia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
}
