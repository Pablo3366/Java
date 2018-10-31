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
public class Cuadrado {
    String identificador = "Cuadrado";
    float lado;
    
    public void capturar(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese un lado: ");
        lado = scan.nextFloat();
    }
    
    public double area(){
        return Math.pow(lado, 2);
    }
}
