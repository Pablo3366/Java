/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lap
 */
public class Multiplicacion {
    public static void main(String[] args){
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
        
        capturar(mul1);
        capturar(mul2);
        
        calcular(mul1, mul2, res);
        
        imprimir(mul1, res, mul2);
    }
    
    public static void imprimir(int[][] matriz, int[][] res, int[] vec){
        System.out.println("Matriz\t\tVector\t\tResultado");
        
        for(int i = 0; i < matriz.length; i++){
            System.out.print(Arrays.toString(matriz[i]) + "\t");
            System.out.print(vec[i] + "\t\t");
            System.out.print(Arrays.toString(res[i]) + "\t");
            System.out.println();
        }
        
    }
    
    public static void capturar(int[][] matriz){
        System.out.println("\nMatriz");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.print("Ingrese coordenada[" + i + "][" + j + "]: ");
                //mul1[j][i] = in.nextInt();
                int r = new Random().nextInt(10); matriz[i][j] = r; System.out.println(r);
            }
        }
    }
    
    public static void capturar(int[] vec){
        System.out.println("\nVector");
        for(int i = 0; i < vec.length; i++){
            System.out.print("Ingrese coordenada[" + i + "]: ");
                //mul2[i] = in.nextInt();
                int r = new Random().nextInt(10); vec[i] = r; System.out.println(r);
        }
    }
    
    public static void calcular(int[][] matriz, int[] vec, int[][] res){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                res[i][j] = matriz[i][j] * vec[i];
            }
        }
    }
}
