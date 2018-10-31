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
public class ComparandoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String materia1 = "Matematicas I", materia2 = "matematicas i";
        
        
        if(materia2.compareTo(materia1) > 0)
            System.out.println(materia2.charAt(0) + "esta despues de " +
                    materia1.charAt(0));
    }
    
}
