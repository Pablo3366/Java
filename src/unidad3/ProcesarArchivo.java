/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author lap
 */
public class ProcesarArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File archivo = new File("/home/lap/Programacion/datos.txt");
        Scanner lector = new Scanner(archivo);
        int numero;
        
        while(lector.hasNextLine()){
            numero = lector.nextInt();
            System.out.println(numero);
        }
        System.out.println("Lectura terminada");
    }
    
}
