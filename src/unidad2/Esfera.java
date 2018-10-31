package esfera;
import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del radio: ");
        float radio= teclado.nextFloat();
        
        double volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);
        
        System.out.println("El volumen de la esfera es: " + volumen);
    }
    
}
