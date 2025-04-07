package clase_1;
import java.util.Scanner;
public class IngresoDatos_ej1 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner e = new Scanner(System.in);
        int N = e.nextInt();
        double A = 4.56;
        char C = 'a';
        System.out.println(N + A);
        System.out.println(A - N);
        System.out.println(C);
    }
}