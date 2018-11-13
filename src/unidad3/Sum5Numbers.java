package unidad3;

import java.util.Scanner;

public class Sum5Numbers {

    public static void main(String[] args) {
        int total = 0; //Almacena el total de la suma de 5 numersos
        int number; //Almacena la entrada acutal
        
        Scanner scan = new Scanner(System.in);
        
        for(int i= 1; i <= 5; i++){
            System.out.print("Introduzca un entero >>> ");
            number = scan.nextInt();
            
            total += number; //Agregar la entreada al total
        }
        
        //Impreción del toal depsues del a cumulación
        System.out.println("El total es: " + total);
    }
    
}
