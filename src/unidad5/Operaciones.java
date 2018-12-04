package unidad5;

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
