package Compra_de_computadoras;

public class Cliente {
    private String nombre;
    private String apellido;
    private int celular;

    public Cliente(){
        this.nombre= "T/N";
        this.apellido= "T/A";
        this.celular= 11781000;
    }

    public Cliente(String nombre,String apellido,int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

}
