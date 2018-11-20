package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Matriz {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int filas, columnas;
        int[][] original, copia;
        
        System.out.print("Ingrese dimensiones de matriz\nFilas: ");
        filas = in.nextInt();
        System.out.print("Columnas: ");
        columnas = in.nextInt();
        
        original = randfill(100, filas, columnas);
        
        copia = matrizclone(original);
        
        imprimir(original, copia);
    }
    
    public static int[][] randfill(int max, int filas, int columnas){
        Random rand = new Random();
        int[][] matriz = new int[filas][columnas];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = rand.nextInt(max);
            }
        }
        
        return matriz;
    }
    
    public static int[][] matrizclone(int[][] original){
        int temp[][] = new int[original.length][original[0].length];
        
        for(int i = 0; i < original.length; i++){
            temp[i] = original[i].clone();
        }
        
        return temp;
    }
    
    public static void imprimir(int[][] original, int[][] copia){
        System.out.println("\nOriginal\n");
        for(int[] i : original) System.out.println(Arrays.toString(i));
        
        System.out.println("\nCopia\n");
        for(int[] i : copia) System.out.println(Arrays.toString(i));
    }
}
