package A1;

import java.util.Scanner;

public class IngresarDatos {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingresar numero:");
        int N = e.nextInt();
        double A = 4.56;
        char C = 'a';
        System.out.println((double)N + A);
        System.out.println(A - (double)N);
        System.out.println(C);
    }
}
