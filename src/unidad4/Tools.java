package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tools {
    public static void capturar(int[] vec, String msg){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < vec.length; i++){
            System.out.print(msg + " [" + i + "]: ");
            vec[i] = in.nextInt();
        }
    }
    
    public static void capturar(int[][] matriz, String msg){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(msg + " [" + i + "][" + j + "]: ");
                matriz[i][j] = in.nextInt();
            }
        }
    }
    
    public static void imprimir(int[] vec){
        System.out.println(Arrays.toString(vec));
    }
    
    public static void imprimir(int[][] matriz){
        for(int i = 0; i < matriz.length; i++)
            System.out.println(Arrays.toString(matriz[i]));
    }
    
    public static int input(String msg){
        Scanner in = new Scanner(System.in);
        int num;
        
        System.out.print(msg);

        while(!in.hasNextInt()){
            System.out.println(in.next() + " no es valido");
            System.out.print(msg);
        }
        num = in.nextInt();
        
        return num;
    }
    
        public static int inputrand(String msg, int min, int max){
        int num;
        System.out.print(msg);
        System.out.println(num = new Random().nextInt(max) + min);
        return num;
    }
}
