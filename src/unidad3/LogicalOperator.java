package unidad3;

public class LogicalOperator {
    public static void main(String[] args) {
    int edad = 75;
    boolean test;
    
    test = (edad > 18 && edad < 65 );
    System.out.println(edad + " > 18 && " + edad + " < 65 es " + test);
    
    test = ( edad < 65 && edad > 18 );
    System.out.println(edad + " < 65 && " + edad + " < 18 es " + test);
    
    test = ( edad > 18 && edad < 85 );
    System.out.println(edad + " > 18 && " + edad + " < 85 es " + test);
    
    test = ( edad > 65 || edad < 18);
    System.out.println(edad + " > 65 ||  " + edad + " < 18 es " + test);
    }
    
}
