package EjerciciosDeRepasoUni6.SistemaElectrico;

public class Consumo {
    private double preciokw;
    private double consumokw;
    private double pagado;

    public Consumo(double preciokw, double consumokw, double pagado) {
        this.preciokw = preciokw;
        this.consumokw = consumokw;
        this.pagado = pagado;
    }

    public double getPreciokw() {
        return preciokw;
    }

    public void setPreciokw(double preciokw) {
        this.preciokw = preciokw;
    }

    public double getConsumokw() {
        return consumokw;
    }

    public void setConsumokw(double consumokw) {
        this.consumokw = consumokw;
    }

    public double getPagado() {
        return pagado;
    }

    public void setPagado(double pagado) {
        this.pagado = pagado;
    }
}
