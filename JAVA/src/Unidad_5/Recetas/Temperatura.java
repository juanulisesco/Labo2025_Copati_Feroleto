package Unidad_5.Recetas;

public enum Temperatura {
    FRIA("fria"), CALIENTE ("caliente");

    private String temperaturas;

    private Temperatura(String temperaturas) {
        this.temperaturas = temperaturas;
    }

    public String getTemperaturas() {
        return temperaturas;
    }

    public void setTemperaturas(String temperaturas) {
        this.temperaturas = temperaturas;
    }
}
