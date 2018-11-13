package ecuacioncuadratica;
import java.util.Scanner;

public class EcuacionCuadratica {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ecuación cuadrática forma ax^2+bx+c");
        System.out.print("Igrese el valor de a: ");
        float terminoA = teclado.nextFloat();
        System.out.print("Igrese el valor de b: ");
        float terminoB = teclado.nextFloat();
        System.out.print("Igrese el valor de c: ");
        float terminoC = teclado.nextFloat();
        
        if(Math.pow(terminoB, 2) - 4 *terminoA * terminoC < 0){
            System.out.println("No tiene soluciones reales");
        }else{
            double x1 = (-terminoB + Math.sqrt(Math.pow(terminoB, 2) - 4*terminoA*terminoC))/(2 * terminoA);
            double x2 = (-terminoB - Math.sqrt(Math.pow(terminoB, 2) - 4*terminoA*terminoC))/(2 * terminoA);
            
            System.out.println("Los resultados son: \nX1 = " + x1 +
                    "\nX2 = " + x2);
        }
    }
    
}
