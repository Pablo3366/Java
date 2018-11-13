
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
        
        System.out.println("Programa que cuenta el numero de reprobados");

        while(keyb.hasNextLine()){
            try{
                calificacion = keyb.nextInt();

                if(calificacion >= 0 && calificacion < 70){
                    reprobados++;}
                calificaciones++;
                
            }catch(Exception e){
                break;
            }
        }

        System.out.println("Se ingresaron " + calificaciones + " datos");
        System.out.println("Calificaciones reprobatorias: " + reprobados);
        
        if(calificaciones > 0){
            System.out.println(porCiento.format((float) (reprobados)/
                    calificaciones) + " del grupo reprobó el examen");
        }
    }
    
}
