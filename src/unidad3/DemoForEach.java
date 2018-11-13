/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

/**
 *
 * @author lap
 */
public class DemoForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] dias = {  "Lunes", "Martes", "Miercoles",
                            "Jueves", "Viernes", "Sabado",
                            "Domingo"};
        
        for(String s:dias)
            System.out.println(s);
    }
    
}
/*
Los numeros inician con cero
Los booleanos inician con false
Los char inician con espacio en blanco
Los objetos no existen (son null)
*/