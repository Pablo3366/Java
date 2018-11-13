package bisiesto;
import java.util.Scanner;


public class Bisiesto {

    public static void main(String[] args) {
        final int DIAS_BISIESTO = 366;
        final int DIAS_NO_BISIESTO = 365;
        
        int año, diasDelAño;
        Scanner teclado;
        
        teclado = new Scanner(System.in);
        System.out.print("Año >>> ");
        año = teclado.nextInt();
        diasDelAño = (año % 4 == 0 ? DIAS_BISIESTO : DIAS_NO_BISIESTO);
        System.out.println("El año " + año + " tuvo/tiene/tendrá " +
                diasDelAño + " dias");
    }
    
}
