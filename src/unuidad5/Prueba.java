/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unuidad5;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        float inicio = 0;
        int opcion;
        Scanner in  = new Scanner(System.in);
        Alcancia cuenta = new Alcancia(inicio);
        String menu = "\n\t\tAlcancia\n\t1- Consultar saldo\n\t2.- Retirar dinero\n" +
                "\t3.- Depositar dinero\n\t4.- Salir\n";
        
        do{
            System.out.println(menu);
            System.out.print("Opcion: ");
            opcion = in.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Su saldo: " +
                            Operaciones.consultarSaldo(cuenta));
                    break;
                case 2: 
                    System.out.print("Cantidad a retirar: ");
                    System.out.println("Se retiraron: " +
                            Operaciones.retirar(cuenta, in.nextFloat()));
                    System.out.println("Nuevo saldo: " +
                            Operaciones.consultarSaldo(cuenta));
                    break;
                case 3:
                    System.out.print("Cantidad a ingresar: ");
                    Operaciones.depositar(cuenta, in.nextFloat());
                    System.out.println("Nuevo saldo: " +
                            Operaciones.consultarSaldo(cuenta));
                    break;
                case 4:
                    System.out.println("Gracias por su preferencia");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
            
        }while(opcion != 4);
    }
    
}
