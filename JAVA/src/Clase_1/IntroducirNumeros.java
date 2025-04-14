package Clase_1;

import java.util.Scanner;

public class IntroducirNumeros {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = e.nextInt();
        int i = 0;

        float[] array;
        for(array = new float[100]; num != -1; ++i) {
            array[i] = (float)num;
            num = e.nextInt();
        }

        for(float n : array) {
            System.out.println(n);
        }

    }
}
