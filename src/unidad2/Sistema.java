package unidad2;
import java.util.Scanner;

public class Sistema {
    float a, b, c, d, e, f,
            x, y;
    
    public void run(){
        Capturar();
        Calcular();
        Mostrar();
    }
    
    public void Capturar(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los cocientes de un sistema de ecucaciones");
        System.out.print("Ingrese A: ");
        a = teclado.nextFloat();
        System.out.print("Ingrese B: ");
        b = teclado.nextFloat();
        System.out.print("Ingrese C: ");
        c = teclado.nextFloat();
        System.out.print("Ingrese D: ");
        d = teclado.nextFloat();
        System.out.print("Ingrese E: ");
        e = teclado.nextFloat();
        System.out.print("Ingrese F: ");
        f = teclado.nextFloat();
    }
    
    public void Calcular(){
        x = (c*e - b*f)/(a*e - b*d);
        y = (a*f - c*d)/(a*e - b*d);
    }
    
    public void Mostrar(){
        System.out.println("Los resultados son: \n" +
                "X = " + x +
                "\nY = " + y);
    }
}
