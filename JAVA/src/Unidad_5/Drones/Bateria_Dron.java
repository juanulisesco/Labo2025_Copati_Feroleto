package Unidad_5.Drones;

public enum Bateria_Dron {
    DIEZ(10), VEINTE(20), TREINTA(30), CUARENTA(40), CINCUENTA(50), SESENTA(60), SETENTA(70), OCHENTA(80), NOVENTA(90), CIEN(100);

    private int num;

    Bateria_Dron(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
