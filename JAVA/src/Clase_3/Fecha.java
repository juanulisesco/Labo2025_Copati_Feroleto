package Clase_3;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha( int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public Fecha(){
        this.dia= 12;
        this.mes= 10;
        this.año= 2007;
    }

    public int getDia() {
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes= mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void valida(){
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un dia a verificar");
        int auxd= e.nextInt();
        System.out.println("Ingrese un mes a verificar");
        int auxm= e.nextInt();
        System.out.println("Ingrese un año a verificar");
        int auxa= e.nextInt();
        if(dia != auxd && mes != auxm && auxa != año){
            this.dia= auxd;
            this.mes= auxm;
            this.año= auxa;
        }
    }
    public void diaMes(int mes) {
        int enero = 1;
        int febrero = 2;
        int marzo = 3;
        int abril = 4;
        int mayo = 5;
        int junio = 6;
        int julio = 7;
        int agosto = 8;
        int septiembre = 9;
        int octubre = 10;
        int noviembre = 11;
        int diciembre = 12;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un mes del año ");
        int mesesito = e.nextInt();
        System.out.println("Ingrese el año ");
        int añito= e.nextInt();
        switch (mes) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (añito % 4 == 0 && añito % 400 == 0) {
                    System.out.println("29");
                }
                else {
                    System.out.println("28");
                }
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("Número de mes no válido.");
                break;
        }
    }

    public static void main(String[] args) {
        Fecha f1 = new Fecha(16, 4, 2025);
        Fecha f2 = new Fecha();

        System.out.println(f1.getDia());
        System.out.println(f1.getMes());
        System.out.println(f1.getAño());
        System.out.println(f1.diaMes(4));
        System.out.println(f2.getDia());
        System.out.println(f2.getMes());
        System.out.println(f2.getAño());
        System.out.println(f2.diaMes(10));
    }
}
