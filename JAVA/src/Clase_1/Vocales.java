package Clase_1;

import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {
        new Scanner(System.in);
        int contador = 0;
        String text = "Ayer me compré muñecos de la marca ‘ToyCo’ por internet. ";

        for(int i = 0; i < text.length(); ++i) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A' || text.charAt(i) == 225 || text.charAt(i) == 193 || text.charAt(i) == 'e' || text.charAt(i) == 'E' || text.charAt(i) == 233 || text.charAt(i) == 201 || text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 237 || text.charAt(i) == 205 || text.charAt(i) == 'o' || text.charAt(i) == 'O' || text.charAt(i) == 243 || text.charAt(i) == 211 || text.charAt(i) == 'u' || text.charAt(i) == 'U' || text.charAt(i) == 250 || text.charAt(i) == 218) {
                ++contador;
            }
        }

        System.out.println(contador);
    }
}
