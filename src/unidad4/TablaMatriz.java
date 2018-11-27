package unidad4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TablaMatriz {
    
    public static void main(String[] main){
        String[] nombres = {"Eduardo", "Sandra", "Diego", "Claudia"};
        String[] materias = {"Matematicas", "Ingles", "Programacion"};
        float[][] calif = new float[3][4];
        float[] promAlum = new float[4];
        float[] promMat = new float[3];
        
        TablaMatriz.capturar(calif, nombres, materias);
        
        //Calcula promedios
        TablaMatriz.avg(calif, promAlum, true);
        TablaMatriz.avg(calif, promMat, false);
        
        //Imprime tabla
        TablaMatriz.imprimir(calif, promAlum, promMat, nombres, materias);
        
        //Imprime mayor y menor
        TablaMatriz.imprimir(promAlum, nombres, true);
        TablaMatriz.imprimir(promMat, materias, false);
    }
    
    
    
    public static void capturar(float[][] calif, String[] nombres,
                                String[] materias){
        
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < calif[0].length; i++){
            System.out.println("\n" + nombres[i]);
            
            for(int j = 0; j < calif.length; j++){
                System.out.print(materias[j] + ": ");
                calif[j][i] = in.nextFloat();
            }
        }
        System.out.println();
    }
    
    public static void avg(float[][] calif, float[] prom, boolean modo){
        //True: Alumnos | False: Materia
        int top1 = (modo)?calif[0].length:calif.length;
        int top2 = (modo)?calif.length:calif[0].length;
        float res;
        
        for(int i = 0; i < top1; i++){
            res = 0;
            for(int j = 0; j < top2; j++){
                res += (modo)?calif[j][i]:calif[i][j];
            }
            
            res /= (modo)?calif.length:calif[0].length;
            prom[i] = res;
        }
    }

    public static void imprimir(float[][] calif, float[] promA, float[] promM,
                                String[] nombres, String[] materias){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print("\t\t");
        for(String i : nombres) System.out.print(i + "\t");
        System.out.println();
        
        for(int i = 0; i < calif.length; i++){
            System.out.print(materias[i] + "\t");
            if(i == 1) System.out.print("\t");
            
            for(int j = 0; j < calif[0].length; j++){
                System.out.print(df.format(calif[i][j]) + "\t");
            }
            
            System.out.println(promM[i]);
        }
        
        System.out.print("\t\t");
        for(float i : promA) System.out.print(df.format(i) + "\t");
        System.out.println();
    }
    
    public static void imprimir(float[] vec, String[] name, boolean modo){
        //True: Mayor | False: Menor
        float res = vec[0];
        for(int i = 0; i < vec.length; i++){
            boolean cond = (modo)?res < vec[i]: res > vec[i];
            if(cond) res = vec[i];
        }
        
        String msg = (modo)?"Mayor alumno(s): ":"Menor materia(s): ";
        System.out.println(msg);
        for(int i = 0; i < vec.length; i++){
            if(vec[i] == res) System.out.println(name[i]);
        }
    }
}
/*
Tarea
Dar un arreglo de promedios alumnos
y un segundo arreglo son los promedios por materia

Imprimir toda la matriz con dormaato, imprimir arreglo de materias
y alumnos, promedio por alumnos y promedios por matera
Ademas imprimir quien fue el promedio mas alto y que materia
obtuvo el promedio mas bajo


Impresa para el jueves
*/