package unidad3;

import java.util.Scanner;

public class CapturaSeguraDeEnteros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese su edad como entero > ");
        
        while(!scan.hasNextInt()){
            /*La llamada al metodo hasNextInt() causa que se active una
            interrupcion para leer desde el teclado, y en caso de que 
            lo tecleado no sea un entero, se ejecutara el cuerpo del while
            */
            String basura = scan.nextLine();
            System.out.println("No puedo recibirle " + basura);
            System.out.print("\nPor favor, ingrese edad como entero > ");
        }
        
        int edad = scan.nextInt();
        System.out.println("ud. ha ingresado " + edad + " como su edad");
    }
    
}
