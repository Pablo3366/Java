package unidad3;

import java.util.Scanner;

public class CapturaSeguraDeEnteros {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese su edad ocmo entero > ");
        
        while(!scan.hasNextInt()){
            /*La llamad al metodo hasNextInt() cauda que se active una
            interrupcion para leer desde el teclado, y en caso de que 
            lo tecleado no sea un entero, se ejecutaŕa el cuerpo del while
            */
            String basura = scan.nextLine();
            System.out.println("No puedo recibirle " + basura);
            System.out.print("\nPor favo, ingrese edad como entero > ");
        }
        
        int edad = scan.nextInt();
        System.out.println("ud. ha ingresado " + edad + " como su edad");
    }
    
}
