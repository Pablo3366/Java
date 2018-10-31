package hipotenusa;
import java.util.Scanner;

public class Hipotenusa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del cateto B: ");
        float catetoB = teclado.nextFloat();
        System.out.print("Ingrese el valor del cateto C: ");
        float catetoC = teclado.nextFloat();
        
        double hipotenusa = Math.sqrt(Math.pow(catetoB, 2)+Math.pow(catetoC, 2));
        
        System.out.println("El valor de la hipotenusa es: " + hipotenusa);
    }
    
}
