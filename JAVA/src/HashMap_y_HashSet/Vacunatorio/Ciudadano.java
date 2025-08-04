package HashMap_y_HashSet.Vacunatorio;

import Clase_2.Persona;
import java.util.HashSet;

public class Ciudadano extends Persona {
    private int dni;
    private String procedencia;
    private String mail;
    private HashSet<Vacuna> Vacunas;

    public Ciudadano(String nombre, String apellido, String direccion, int dni, String procedencia, String mail) {
        super(nombre, apellido, direccion);
        this.dni = dni;
        this.procedencia = procedencia;
        this.mail = mail;
        this.Vacunas= new HashSet<>();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Vacuna> getVacunas() {
        return Vacunas;
    }

    public void setVacunas(HashSet<Vacuna> vacunas) {
        Vacunas = vacunas;
    }
}
