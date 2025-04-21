package Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import Clase_2.Persona;
import java.util.StringJoiner;

public class Operaciones_básicas {
    public static void main(String[] args) {

//a)
        ArrayList<Integer> numEnteros = new ArrayList<Integer>();
        numEnteros.add(1);
        numEnteros.add(2);
        numEnteros.add(3);
        numEnteros.add(4);
        numEnteros.add(5);
        int suma =  0;
        for ( int numero : numEnteros){
            suma+= numero;
        }
        System.out.println(suma);

//b)
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Avion");
        palabras.add("Pablo");
        palabras.add("Lindo");
        palabras.add("Planear");
        palabras.add("Zoologico");
        System.out.println("Ingresar letra deseada");
        Scanner e = new Scanner(System.in);
        char letra = e.next().charAt(0);
        for(String p : palabras){
            if(p.charAt(0) == letra) {//= a palabras.get(i)
                System.out.println(p);
            }
        }

//c)
        ArrayList<Persona> personas = new ArrayList<Persona>();
        for (int i = 0; i < personas.size(); i++) {
            if ( personas.get(i).getEdad() == 30){
                System.out.println(personas.get(i).getNombre());
            }
            else{
                System.out.println("La persona no tiene 30");
            }
        }
    }
}

