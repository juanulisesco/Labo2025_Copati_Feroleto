package HashMap_y_HashSet.PagoDeEmpleados;

public enum TipoDiseñador {
    UX(0.08), UI(0.07), IT(0.12);

    private double comision;

    TipoDiseñador(double comision) {
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
}
