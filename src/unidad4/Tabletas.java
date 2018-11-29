package unidad4;

class Tablet{
    String marca, modelo;
    int tamañoPantalla;
    float precio;
    
    public Tablet(String marca, String modelo, int tamaño, float precio){
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
        setTamañoPantalla(tamaño);
    }
    
    public void setMarca(String var){
        marca = var;
    }
    
    public void setModelo(String var){
        modelo = var;
    }
    
    public void setTamañoPantalla(int var){
        tamañoPantalla = var;
    }
    
    public void setPrecio(float var){
        precio = var;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public int getTamañoPantalla(){
        return tamañoPantalla;
    }
    
    public float getPrecio(){
        return precio;
    }
    
}

public class Tabletas {

    public static void main(String[] args) {
        Tablet x = new Tablet("Marca", "Modelo", 12, 12);
        
        x.setMarca("Sony Xperia");
        x.setModelo("X");
        x.setTamañoPantalla(11);
        x.setPrecio(3500);
        
        System.out.println(x.getMarca());
        System.out.println(x.getModelo());
        System.out.println(x.getTamañoPantalla());
        System.out.println(x.getPrecio());
    }
    
}
