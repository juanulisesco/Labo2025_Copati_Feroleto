package Unidad_4.Ruedas;

public enum Rueda {
    DEBICI("2"), DEAUTO("4");

    private String rueda2;

    private Rueda(String rueda2){
        this.rueda2=rueda2;
    }

    public String getRueda2() {
        return rueda2;
    }

    public void setRueda2(String rueda2) {
        this.rueda2 = rueda2;
    }
}
