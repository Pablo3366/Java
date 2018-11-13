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
public class Rectangulo {
    
    String identificador = "Rectangulo";
    float base, altura;
    
    public void capturar(){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ingrese la base: ");
        base = scan.nextFloat();
        System.out.print("Ingrese la altura: ");
        altura = scan.nextFloat();
    }
    
    public double area(){
        return base*altura;
    }
    
}
