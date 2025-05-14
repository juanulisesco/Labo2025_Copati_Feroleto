package A1;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un valor para N: ");
        int N = e.nextInt();
        System.out.println("Ingrese un valor para A: ");
        int A = e.nextInt();
        if (N < A) {
            System.out.println("N es menor a A");
        } else if (N > A) {
            System.out.println("N es mayor a A");
        } else {
            System.out.print("Son iguales");
        }

    }
}
