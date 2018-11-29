package unidad4;

import java.util.Scanner;

public class Objeto {

    int captura(String letrero){
        Scanner teclado = new Scanner(System.in);
        System.out.println(letrero);
        return teclado.nextInt();
    }
    
    /*Sin usar metodos estaticos:
    Podría llamarse aunque el metodo no fuera static, pero un objeto
    tendría que recibir la solicitud de activacioń del mensaje para la captura
    */
    
    public static void main(String[] args) {
        Objeto demo = new Objeto();
        int edad = demo.captura("¿Cuantos años tienes? ");
        int semestre = demo.captura("¿En que semestre estas? ");
        int numMaterias = demo.captura("¿Cuantas materias llevas? ");
        
        System.out.println("UD. repondio\n" + 
                edad + " a la pregunta sobre su edad\n" +
                semestre + " al semestre que esttudia\n" + 
                numMaterias + " a la cantidad de materias que ud cursa");
    }
    
}
