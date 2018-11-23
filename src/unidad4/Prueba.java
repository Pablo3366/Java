package unidad4;

import java.util.Scanner;
import static unidad4.Multiplicacion.calcular;
import static unidad4.Multiplicacion.capturar;
import static unidad4.Multiplicacion.imprimir;

public class Prueba {
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
        
        capturar(mul1, true, 10);
        capturar(mul2, true, 10);
        
        calcular(mul1, mul2, res);
        
        imprimir(mul1, res, mul2);

    }
}
