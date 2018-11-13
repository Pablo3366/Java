package unidad3;
import java.util.Scanner;

public class Centinela {

    public static void main(String[] args) {
        final int CENTINELA = -1;
        int valor = 0, suma = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese valor o -1 para terminar >>");
        valor = in.nextInt();
        
        while(valor != CENTINELA){
            suma += valor;
            System.out.println("valor ingresado = " + valor + "\n" +
                    "acumulado = " + suma);
            System.out.print("Ingrese valor o -1 para terminar >>");
            valor = in.nextInt();
        }
    }
    
}
