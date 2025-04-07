package clase_1;
import java.util.Scanner;
public class ReemplazoLetras_ej6 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int contador= 0;
        String text= "Ayer me compré muñecos de la marca ‘ToyCo’ por internet. ";
        for (int i = 0; i < text.length(); i++ ){
            if(text.charAt(i) == 'e' || text.charAt(i) == 'E' || text.charAt(i) == 'é' || text.charAt(i) == 'É'){
                System.out.println("Ingrese una letra o numero porla cual quiere reemplazar: ");
                String rem= e.nextLine();
                text.charAt(i)= rem;

            }
        }
        System.out.println(contador);
    }
}