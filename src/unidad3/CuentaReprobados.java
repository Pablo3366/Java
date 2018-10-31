
package unidad3;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

public class CuentaReprobados {

    public static void main(String[] args) throws FileNotFoundException {
        int reprobados = 0, calificaciones = 0, calificacion;
        File archivo = new File("/home/lap/Programacion/calificaciones.txt");
        Scanner keyb = new Scanner(archivo);
        DecimalFormat porCiento = new DecimalFormat("#0.00%");
        System.out.print("Programa que cuenta el numero de reprobados");
        System.out.println(" en examen\nIntroduzca -1 para parar");
        
        calificacion = keyb.nextInt();
        while(calificacion != -1){
            if(calificacion >= 0 && calificacion < 70)
                reprobados++;
            calificaciones++;
            
            calificacion = keyb.nextInt();
        }
        
        System.out.println("Se ignresaron " + calificaciones + " datos");
        System.out.println("Calificaciones reprobatorias: " + reprobados);
        
        if(calificaciones > 0){
            System.out.println(porCiento.format((float) (reprobados)/
                    calificaciones) + " del grupo reprobó el examen");
        }
    }
    
}
