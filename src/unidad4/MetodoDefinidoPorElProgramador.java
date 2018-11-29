package unidad4;

import java.util.Calendar;
import java.util.Scanner;

public class MetodoDefinidoPorElProgramador {

    /*Usando métodos estaicos:
    1) Para poder usarlo somoc en las lineras 12, 13, y 14, necesitamos que el 
    metodo sea estatico
    
    2) Es necesario hacerlo así porque se esta llamando desde el main
    que tiene un contexto static
    */
    
    public static void main(String[] args) {
        int edad = captura("¿Cuantos años tienes? ");
        int semestre = captura("¿En que semestre estas? ");
        int numMaterias = captura("¿Cuantas materias llevas? ");
        
        System.out.println("UD. repondio\n" + 
                edad + " a la pregunta sobre su edad\n" +
                semestre + " al semestre que esttudia\n" + 
                numMaterias + " a la cantidad de materias que ud cursa");
    }
 
    static int captura(String letrero){
        Scanner teclado = new Scanner(System.in);
        System.out.println(letrero);
        return teclado.nextInt();
    }
}


//Primer ejercicio
class Reloj{
    private String hora;
    
    public String queHorasSon(){
        Calendar calendario = Calendar.getInstance();
        
        hora = "son las " + calendario.get(Calendar.HOUR_OF_DAY) + 
                " horas y " + calendario.get(Calendar.MINUTE) + " minutos";
        
        return hora;
    }
}