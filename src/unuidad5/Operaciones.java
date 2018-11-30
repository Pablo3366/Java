/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unuidad5;

/**
 *
 * @author lap
 */
public class Operaciones {
    public static void depositar(Alcancia cuenta, float cantidad){
        if(cantidad >= 0){
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
        }
    }
    
    public static float retirar(Alcancia cuenta, float cantidad){
        if(cantidad <= 0 || cantidad > cuenta.getSaldo()){
            cantidad = 0;
        }else{
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
        }
        
        return cantidad;
    }
    
    public static float consultarSaldo(Alcancia cuenta){
        return cuenta.getSaldo();
    }
}
