/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad2;
import java.util.Scanner;

/**
 *
 * @author lap
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int num = teclado.nextInt();
        int res = num*num;
        System.out.println("El numero es: " + res);
    }
    
}
