package clase_1;
import java.util.Scanner;
public class IntroducirNumeros_ej7 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = e.nextInt();
        int i= 0;
        float [] array = new float[100];
        while(num!= -1){
            array[i] = num;
            num = e.nextInt();
            i++;
         }

        for (float n : array){
            System.out.println(n);
        }
    }
}
