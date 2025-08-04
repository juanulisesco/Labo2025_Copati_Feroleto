package HashMap_y_HashSet.Vacunatorio;

import java.time.LocalDate;

public class Vacuna {
    private LocalDate fechaFabricacion;
    private LocalDate aplicacion;
    private int lote;
    private int numeroFabricacion;
    private String nombre;

    public Vacuna(LocalDate fechaFabricacion, LocalDate aplicacion, int lote, int numeroFabricacion, String nombre) {
        this.fechaFabricacion = fechaFabricacion;
        this.aplicacion = aplicacion;
        this.lote = lote;
        this.numeroFabricacion = numeroFabricacion;
        this.nombre = nombre;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public LocalDate getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(LocalDate aplicacion) {
        this.aplicacion = aplicacion;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public int getNumeroFabricacion() {
        return numeroFabricacion;
    }

    public void setNumeroFabricacion(int numeroFabricacion) {
        this.numeroFabricacion = numeroFabricacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
