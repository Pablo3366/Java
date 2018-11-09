package unidad3;

import java.util.Scanner;

public class Factorial {
    
    static int factorial;
    
    public static int capturar(String msg){
        Scanner scan = new Scanner(System.in);
        
        System.out.print(msg);
        return scan.nextInt();
    }
    
    public static long calcular(int factorial){
        Factorial.factorial = factorial;
        if(factorial == 0) return 1;
        else if (factorial < 0) return 0;
        
        long fact = 1;
        
        for(int i = factorial; i>0; i--){
            fact *=i;
        }
        return fact;
    }
    
    public static void imprimir(String msg, long fact){
        if(factorial >= 0) System.out.println(msg + fact);
        else System.out.println(msg + "No");
    }
    
    public static int factrec(int index){
        return (index==0)?1:index * factrec(index -1);
    }
}
