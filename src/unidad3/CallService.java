package unidad3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CallService {

    public static void main(String[] args) {
        String menu =   "\nOpciones disponibles" + 
                        "\n\tC Cualquier horario 1,000 minutos: $250" +
                        "\n\tF Fin de semana, minutos ilimitados: 70" +
                        "\n\tL Larga distancia nacional: $120" +
                        "\n\tM Mensaje de texto: $60";
        char opcion;
        double costo = 100; //Costo base
        DecimalFormat money = new DecimalFormat("$###.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSeleccione opciones para su llamada por celular");
        System.out.println("Costo base: " + money.format(costo));
        
        do{
            
            System.out.println(menu);
            System.out.println("Introduzca una opcion o pulse \"S\" para parar > ");
            opcion = scan.next().charAt(0);
            switch(opcion){
                case 'c':
                case 'C': System.out.println("Cualquier horario 1000 minutos $25.49");
                          costo += 250; break;
                case 'f':
                case 'F': System.out.println("Fin de semana minutos ilimitados $6.99");
                          costo += 70; break;
                case 'l':
                case 'L': System.out.println("Larga distancia nacional $12.99");
                            costo += 120; break;
                case 'm':
                case 'M': System.out.println("Mensaje de texto $5.99");
                            costo += 60; break;
                default: System.out.println("Tecleó una opción no valida");
            }
            
            System.out.println("Costo actual: " + money.format(costo));
        }while(opcion != 'S' && opcion!= 's');
        
        System.out.println("\nCosto de servicio telefónico: " + money.format(costo));
    }
    
}
