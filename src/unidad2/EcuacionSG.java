
package unidad2;
import java.util.Scanner;

public class EcuacionSG {
    float terminoA, terminoB, terminoC;
    double discriminante, x2, x1;
    
        public void run(){
        Capturar();
        Calcular();
        Mostrar();
    }
    
    public void Capturar(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los cocientes de la ecuación cuadratica");
        System.out.print("Ingrese A: ");
        terminoA = teclado.nextFloat();
        System.out.print("Ingrese B: ");
        terminoB= teclado.nextFloat();
        System.out.print("Ingrese C: ");
        terminoC = teclado.nextFloat();
    }
    
    public void Calcular(){
        discriminante = Math.pow(terminoB, 2) - 4 *terminoA * terminoC;
       
        x1 = (-terminoB + Math.sqrt(discriminante))/(2 * terminoA);
        x2 = (-terminoB - Math.sqrt(discriminante))/(2 * terminoA);
    }
    
    public void Mostrar(){
            System.out.println("Los resultados son: \nX1 = " + x1 +
                    "\nX2 = " + x2);
    }
}
