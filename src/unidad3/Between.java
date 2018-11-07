package tareas;

import java.util.Scanner;

public class Between {
    public static int capturar(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre el 1 y el 10 >>> ");
        while(!in.hasNextInt()){
            String temp = in.next();
            System.out.print("\"" + temp + "\" no es valido, ingrese un entero >>> ");
        }
        return in.nextInt();
    }
    
    public static void verificar(int min, int max){
        int num;
        
        do{
            num = capturar();
        }while(rango(num, min, max));
        
        mostrar(num);
    }
    
    public static boolean rango(int num, int floor, int ceil){
        return num < floor || num > ceil;
    }
    
    public static void mostrar(int num){
        System.out.println("Número dentro del rango: " + num);
    }
}
