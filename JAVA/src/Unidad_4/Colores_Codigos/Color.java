package Unidad_4.Colores_Codigos;

public enum Color {
    BLANCO("#FFFFFF"), NEGRO ("#000000"), ROJO ("#FF0000"),
    NARANJA ("#FFA500"), AMARILLO("#FFFF00"), VERDE ("#00FF00"),
    AZUL ("#0000FF"), VIOLETA ("#800080");

    private String nombreColores;

    private Color (String nombreColores){
        this.nombreColores= nombreColores;
    }

    public String getNombreColores() {
        return nombreColores;
    }

    public void setNombreColores(String nombreColores) {
        this.nombreColores = nombreColores;
    }

}
