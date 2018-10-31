package unidad3;
import java.util.Scanner;

public class pruebaCalificacion {
    
    public static void main(String[] args){
    
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca: \n\tCalificacioń de examen > ");

        int calificacion = scan.nextInt();
        if(calificacion > 0 && calificacion <= 100){
            
            if(calificacion >= 70 && calificacion < 100){
                System.out.print("\tPuntos extra > ");
                int puntosExtra = scan.nextInt();
                
                if(puntosExtra > 0)
                    calificacion += puntosExtra;
            }
            System.out.println("su calificacion final es de " + calificacion);
        }else System.out.println("Ingrese una calificacion positiva y menor o igual que 100");
    }
}