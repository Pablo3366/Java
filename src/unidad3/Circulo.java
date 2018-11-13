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
public class Circulo {
    String identificador = "Circulo";
    float radio;
    
    public void capturar(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese el radio: ");
        radio = scan.nextFloat();
    }
    
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
}
