package clase_1;
import java.util.Scanner;
public class DivisibleFor_ej3 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        for (int i = 1; i <= 100; i++ ){
            if( i % 6 == 0 ) {
                System.out.print(i);
                System.out.print(" ");
                System.out.println("es divisibles por 2 y 3");
            }
            else {
                System.out.print(i);
                System.out.print(" ");
                System.out.println("no es divisibles por 2 y 3");
            }
        }
    }
}
