package unidad3;
import java.util.Scanner;

public class CalificacionLetra {
    
    public static void main(String[] args){
        
        Scanner scan =  new Scanner(System.in);
        
        char letra;
        
        System.out.print("Introduzco su calificacion: ");
        int calificacion = scan.nextInt();
        
        if(calificacion >= 90)
            letra = 'A';
        else if(calificacion >= 80)
            letra = 'B';
        else if(calificacion >= 70)
            letra = 'C';
        else if(calificacion >= 60)
            letra = 'D';
        else // calificacion para diferente a las anteriores
            letra = 'F';
        
        System.out.println("Tu calificacion de " + calificacion +
                "equivale a una " + letra);
    }
}
