package A1;

import java.util.Scanner;

public class ReemplazoLetra {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int contador = 0;
        String text = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet. ";
        System.out.println("Ingrese la letra por la cual quiere cambiar a las e: ");
        char letra = e.next().charAt(0);
        text.replace('e', letra);
        System.out.println(contador);
        System.out.println(text);
    }
}
