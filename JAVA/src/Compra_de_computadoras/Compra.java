package Compra_de_computadoras;

import java.util.Objects;

public class Compra extends Cliente{
    private String metodo_p;

    public Compra(){
        super();
        this.metodo_p="Efectivo";
    }

    public Compra(String nombre,String apellido,int celular, String metodo_p){
        super(nombre, apellido, celular);
        this.metodo_p= metodo_p;
    }


}
