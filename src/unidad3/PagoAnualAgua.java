package unidad3;

import java.util.Arrays;
import java.util.Scanner;

public class PagoAnualAgua {
    /*Arreglo de 20 que contnga numeros <T> 
    generar dos más, el primero, numeros impares
    el segundo debe contener numeros multiplos de 6
    
    Al final imprimir los tres arreglos
    */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float [] reciboAgua = new float[6];
        float suma = 0, pago;
        int mes = 0;
        
        do{
            System.out.print("Ingrese cuenta del agua del mes " + (mes+1));
            System.out.print(" o -1 para terminar: ");
            pago = teclado.nextFloat();
                if(pago != -1){
                    reciboAgua[mes] = pago;
                    suma += reciboAgua[mes];
                    mes ++;
                    if(mes >= reciboAgua.length){
                        float [] copia = new float[reciboAgua.length+1];
                        System.out.println(Arrays.toString(copia));
                        for(int i = 0; i < reciboAgua.length; i++)
                            copia[i] = reciboAgua[i];

                        reciboAgua = copia;
                    }
                }
            }while(mes < 12 && pago != -1);
        
            System.out.println("\nPago mensual promedio --> " + (suma/mes));
            System.out.println("Pago acumulado de " + mes + " meses --> " + suma);
        }
    }
    
