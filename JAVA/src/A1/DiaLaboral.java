package A1;

import java.util.Scanner;

public class DiaLaboral {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana: ");
        String dia = e.nextLine();
        if (!dia.equals("Lunes") && !dia.equals("Martes") && !dia.equals("Miercoles") && !dia.equals("Jueves") && !dia.equals("Viernes")) {
            System.out.println("No es un dia de la semana");
        } else {
            System.out.println("Es un dia de la semana");
        }

    }
}
