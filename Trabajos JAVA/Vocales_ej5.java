package clase_1;
import java.util.Scanner;
public class Vocales_ej5 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int contador= 0;
        String text= "Ayer me compré muñecos de la marca ‘ToyCo’ por internet. ";
        for (int i = 0; i < text.length(); i++ ){
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A' || text.charAt(i) == 'á' || text.charAt(i) == 'Á'
                    || text.charAt(i) == 'e' || text.charAt(i) == 'E' || text.charAt(i) == 'é' || text.charAt(i) == 'É'
                    || text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'í' || text.charAt(i) == 'Í'
                    || text.charAt(i) == 'o' || text.charAt(i) == 'O' || text.charAt(i) == 'ó' || text.charAt(i) == 'Ó'
                    || text.charAt(i) == 'u' || text.charAt(i) == 'U' || text.charAt(i) == 'ú' || text.charAt(i) == 'Ú'){
                    contador++;

            }
        }
        System.out.println(contador);
    }
}