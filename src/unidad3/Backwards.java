package unidad3;

import javax.swing.JOptionPane;

public class Backwards {

    public static void main(String[] args) {
        String original, backwards = "";
        
        original = JOptionPane.showInputDialog(null, "Introduzca un String");
        
        for(int i = original.length() -1; i >= 0; i--){
            backwards += original.charAt(i);
        }
        
        JOptionPane.showMessageDialog(null, "El Sting al revés es: " + backwards);
    }
    
}


/* 
""Tarea Fibonacci""

Imprimir los primeros cicuenta terminos, con ciclos y métodos

*/