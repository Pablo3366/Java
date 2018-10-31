package unidad3;
import java.util.Scanner;


public class Menor {
    
    static int numero1, numero2, numero3, min;
    
    public static int buscar(int num1, int num2, int num3){
        if(num1 < num2 && num1 < num3) return num1;
        else if(num2 < num1 && num2 < num3) return num2;
        else if(num3 < num1 && num3 < num2) return num3;
        else return (num1==num2)?num2:num3;
    }
    
    public static void capturar(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese tres numeros: ");
        System.out.print("Numero1 >>> ");
        numero1 = in.nextInt();
        System.out.print("Numero2 >>> ");
        numero2 = in.nextInt();
        System.out.print("Numero3 >>> ");
        numero3 = in.nextInt();
    }
    
    public static void mostrar(int resultado){
        System.out.println("\nEl menor es " + resultado);
    }
    public static void main(String[] args) {
        capturar();
        mostrar(buscar(numero1, numero2, numero3));
    }
    
}
