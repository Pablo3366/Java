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

import java.util.Random;
import java.util.Scanner;

public class Range {
    int menor_15, entre50_55, mayor_50;
    
    public static int input(String msg, int min){
        Scanner in = new Scanner(System.in);
        int num;
        
        do{
            System.out.print(msg);
            
            while(!in.hasNextInt()){
                System.out.println(in.next() + " no es valido");
                System.out.print(msg);
            }
            num = in.nextInt();
        }while(num < min);
        
        return num;
    }
    
    public void calcular(int range, int min){
        for(int i = 1; i <= range; i++){
            
            int num = input("Ingresa el número (" + i + "): ", min);
            
            if(num < 15) menor_15++;
            else if(num >= 50 && num <= 55) entre50_55++;
            
            if(num > 50) mayor_50++;
        }
    }
    
    public void imprimir(String msg){
        System.out.println(msg);
        System.out.println( "\nMenores de 15: " + menor_15  +
                            "\nEntre 50 y 55: " + entre50_55+
                            "\nMayores de 50: " + mayor_50);
    }
    
    public static int input2(String msg, int min){
        int num;
        System.out.print(msg);
        System.out.println(num = new Random().nextInt(100) + min);
        return num;
    }
}
