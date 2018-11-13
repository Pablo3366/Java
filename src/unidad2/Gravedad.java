package unidad2;
import java.util.Scanner;

public class Gravedad {
    
    float masa1, masa2, distancia;
    static final double CONSTANTE = 6.673 * Math.pow(10, -8);
    
    public void run(){
        Capturar();
        Mostrar(CalcularG());
    }
    
    public void Capturar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo de la Fuerza de atracción");
        System.out.print("Ingrese la masa1 (g)>> ");
        masa1 = teclado.nextFloat();
        System.out.print("Ingrese la masa2 (g)>> ");
        masa2 = teclado.nextFloat();
        System.out.print("Ingrese la distancia (cm)>> ");
        distancia = teclado.nextFloat();
    }
    
    public double CalcularG(){
        double Fuerza = (CONSTANTE * masa1 * masa2) / Math.pow(distancia, 2);
        return Fuerza;
    }
    
    public void Mostrar(double Fuerza){
        System.out.print("La fuerza de artacción es: " + Fuerza + "\n");
    }
}
