package Compra_de_computadoras;

public class Efectivo extends MetodoPago{
    @Override
    public double precioFinal(double montoBase) {
        return montoBase;
    }
}
