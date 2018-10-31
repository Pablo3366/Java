package calcularpromedio;
import java.util.Scanner;

public class CalcularPromedio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese tres números: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        double numero3 = teclado.nextDouble();
        
        double promedio = (numero1 + numero2 + numero3) / 3;
        
        System.out.println("El promedio de " + numero1 + ", " +
                numero2 + " y " + numero3 + " es de " + 
                promedio);
    }
    
}
