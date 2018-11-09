/*  
    Tarea
    
    Desarrollar un programcion en Java que determine en un conjunto de 40
    numeros naturales (enteros positivos) capturados del teclado. ¿Cuantos son
    menores de 15, cuantos son mayores de 59 y cuantos estan comprendidos entre
    45 y 55?. Debe ipmprimir cuantos numeros de los capturados estan dentro de
    cada rango. Utilice metodos. Desarrolle 2 clases una de prueba y una que
    contenga los metodos, (capturar, clacular e imprimir

*/
package unidad3;

import java.util.Scanner;

public class Range {
    int menor_15, entre45_55, mayor_59;
    
    public static int input(String msg){
        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        
        while(!in.hasNextInt()){
            System.out.println(in.next() + " no es valido");
            System.out.print(msg);
        }
        return in.nextInt();
    }
    
    public void calcular(int range){
        for(int i = 1; i <= range; i++){
            
            int num = input("Ingresa el número (" + i + "): ");
            
            if(num < 15) menor_15++;
            else if(num >= 45 && num <= 55) entre45_55++;
            else if(num > 59) mayor_59++;
        }
    }
    
    public void imprimir(String msg){
        System.out.println(msg);
        System.out.println( "\nMenores de 15: " + menor_15  +
                            "\nEntre 45 y 55: " + entre45_55+
                            "\nMayores de 59: " + mayor_59);
    }
}
