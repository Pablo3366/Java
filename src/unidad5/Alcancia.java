package unidad5;

public class Alcancia {
    private float saldo;
    
    public Alcancia(float saldo){
        setSaldo(saldo);
    }
    
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    
    public float getSaldo(){
        return saldo;
    }
}
