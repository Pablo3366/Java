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
        String menu = "\t\tAlcancia\n\t.1- Consultar saldo\n\t2.- Retirar dinero\n" +
                "\t3.- Depositar dinero\n\t4.- Salir\n";
        
        do{
            System.out.println(menu);
            System.out.print("Opcion: ");
            opcion = in.nextInt();
            
            switch(opcion){
                case 1: System.out.println(Operaciones.consultarSaldo(cuenta));
            }
            
        }while(opcion != 4);
        
        System.out.println("Con cuanto inciará la cuenta: ");
        
        System.out.println("Cuenta: " + Operaciones.consultarSaldo(cuenta));
        
        System.out.print("Cantidad a ingresar: ");
        Operaciones.depositar(cuenta, in.nextFloat());
        System.out.println("Nuevo saldo: " + Operaciones.consultarSaldo(cuenta));
        
        System.out.print("Cantidad a retirar: ");
        System.out.println("Se retiraron: " + Operaciones.retirar(cuenta, in.nextFloat()));
        System.out.println("Nuevo saldo: " + Operaciones.consultarSaldo(cuenta));
    }
    
}
