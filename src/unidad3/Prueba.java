package unidad3;

public class Prueba {

    public static void main(String[] args){
        //Fibonacci.imprimirrec(50);
        //Fibonacci.imprimir();
        
        Factorial.imprimir("La factorial es: ",
                Factorial.calcular(Factorial.capturar("Ingrese numero: ")));
        
        System.out.println(Factorial.factrec(5));
    }
    
}
