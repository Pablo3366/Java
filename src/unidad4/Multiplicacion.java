package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Multiplicacion {
    
    public static void run(){
        Scanner in = new Scanner(System.in);
        
        int[][] mul1, res;
        int[] mul2;
        int filas, columnas;
        
        System.out.print("Ingrese numero de filas: ");
        filas = in.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        columnas = in.nextInt();
        
        mul1 = new int[filas][columnas];
        res = new int[filas][columnas];
        mul2 = new int[filas];
        
        capturar(mul1, true, 10);
        capturar(mul2, true, 10);
        
        calcular(mul1, mul2, res);
        
        imprimir(mul1, res, mul2);
    }
    
    public static void capturar(int[][] matriz, boolean rand, int max){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nMatriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("Ingrese coordenada[" + i + "][" + j + "]: ");
                if(!rand) matriz[i][j] = in.nextInt();
                else{
                    int r = new Random().nextInt(max);
                    matriz[i][j] = r;
                    System.out.println(r);
                } 
            }
        }
        System.out.println();
    }
    
    public static void capturar(int[] vec, boolean rand, int max){
        Scanner in = new Scanner(System.in);
        
        System.out.println("\nVector");
        for(int i = 0; i < vec.length; i++){
            System.out.print("Ingrese coordenada[" + i + "]: ");
                if(!rand) vec[i] = in.nextInt();
                else{
                    int r = new Random().nextInt(max);
                    vec[i] = r;
                    System.out.println(r);
                }
        }
        System.out.println();
    }
    
    public static void calcular(int[][] matriz, int[] vec, int[][] res){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                res[i][j] = matriz[i][j] * vec[i];
            }
        }
    }
    
    public static void imprimir(int[][] matriz, int[][] res, int[] vec){
        System.out.println("Rsultado");
        
        for(int i = 0; i < matriz.length; i++){
            String buff = Arrays.toString(matriz[i]);
            System.out.print(buff.replace(" ", "\t"));
            
            if(matriz.length/2 == i) System.out.print("\tx\t");
            else System.out.print("\t\t");
            
            System.out.print(vec[i]);
            
            if(matriz.length/2 == i) System.out.print("\t=\t");
            else System.out.print("\t\t");
            
            buff = Arrays.toString(res[i]);
            System.out.print(buff.replace(" ", "\t"));
            System.out.println();
        }
        
    }
}
