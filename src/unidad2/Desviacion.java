package unidad2;
import java.util.Scanner;

public class Desviacion {
    float x1, x2, x3, x4, x5, x6;
    
    public void run(){
        Capturar();
        Mostrar(CalcularMedia(), CalcularDesviacion(CalcularMedia()));
    }
    
    public void Capturar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo de Media y Desviación estandar");
        System.out.print("Ingresa X1 >> ");
        x1 = teclado.nextFloat();
        System.out.print("Ingresa X2 >> ");
        x2 = teclado.nextFloat();
        System.out.print("Ingresa X3 >> ");
        x3 = teclado.nextFloat();
        System.out.print("Ingresa X4 >> ");
        x4 = teclado.nextFloat();
        System.out.print("Ingresa X5 >> ");
        x5 = teclado.nextFloat();
        System.out.print("Ingresa X6 >> ");
        x6 = teclado.nextFloat();
    }
    
    public double CalcularMedia(){
        double x = (x1 + x2 + x3 + x4 + x5 + x6)/6;
        return x;
    }
    
    public double CalcularDesviacion(double xr){
        double desviacion = Math.sqrt((Math.pow(x1-xr, 2) + Math.pow(x2-xr, 2) +
                Math.pow(x3-xr, 2) + Math.pow(x4-xr, 2) +Math.pow(x5-xr, 2) +
                Math.pow(x6-xr, 2))/5);
        return desviacion;
    }
    
    public void Mostrar(double media, double desviacion){
        System.out.println("La media es: " + media +
                "\nLa desviación estandar: " + desviacion + "\n");
    }
}
