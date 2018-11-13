package capital;
import java.util.Scanner;

public class Capital {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingresa el capital inicial: ");
        float capitalI = teclado.nextFloat();
        System.out.print("Ingresa el interes (como entero): ");
        int interes = teclado.nextInt();
        
        double impuestos = capitalI * (double)(interes /100.0);
        double capitalF = capitalI + impuestos;
        
        System.out.println("El interes generado es de: " + impuestos + 
                "El capital generado es de: " + capitalF);
        
    }
    
}
