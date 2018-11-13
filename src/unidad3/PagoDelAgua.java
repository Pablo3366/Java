/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.util.Scanner;

/**
 *
 * @author lap
 */
public class PagoDelAgua {
    float [] reciboAgua = new float[6];
    float suma = 0;
    int indiceMenor = 0, indiceMayor = 0;
    
    public void run(){
        capturar();
        buscar();
        imprimir();
    }
    
    public void capturar(){
        Scanner in = new Scanner(System.in);
        
        for(int i = 0; i < reciboAgua.length; i++){
            System.out.print("Ingrese el pago del mes " + (i+1) + ": ");
            reciboAgua[i] = in.nextFloat();
        }
    }
    
    public void buscar(){
        for(int indice = 0; indice < reciboAgua.length; indice++){
            suma += reciboAgua[indice];
            if(reciboAgua[indice] < reciboAgua[indiceMenor])
                indiceMenor = indice;
            if(reciboAgua[indice] > reciboAgua[indiceMayor])
                indiceMayor = indice;
        }
    }
    
    public void imprimir(){
        System.out.println("Pago mensial promedio: " + (suma/6));
        System.out.println("Pago acumulado de 6 meses: " + suma);
        System.out.println("El mes " + (indiceMenor+1) + " se pago menos");
        System.out.println("El mes " + (indiceMayor+1) + " se pago mas");
        
        System.out.print("\nArreglo: ");
        for(float i: reciboAgua) System.out.print("|" + i + "|");
    }
}

/*
Tarea | Jueves | No impreso
Rango con arreglos

Pedir al usuario la logitud del arreglo
Final imprimir todo el arreglo
*/
