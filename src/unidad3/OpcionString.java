package unidad3;
import java.util.Scanner;

public class OpcionString {
    
    static String opcion;
    
    public static void main(String[] args){
        
        CapturarOpcion();
        
        if(opcion.equals("Rectangulo")){
            Rectangulo rect = new Rectangulo();
            rect.capturar();
            Mostrar(rect.identificador, rect.area());
        }else if(opcion.equals("Triangulo")){
            Triangulo tri = new Triangulo();
            tri.capturar();
            Mostrar(tri.identificador, tri.area());
        }else if(opcion.equals("Cuadrado")){
            Cuadrado cuad = new Cuadrado();
            cuad.capturar();
            Mostrar(cuad.identificador, cuad.area());
        }else if (opcion.equals("Circulo")){
            Circulo circ = new Circulo();
            circ.capturar();
            Mostrar(circ.identificador, circ.area());
        }else System.out.println("Error");
    }
    
    static void CapturarOpcion(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Opciones:\n" + 
                "Rectangulo\nTriangulo\nCuadrado\nCirculo\n" +
                "Ingrese una opcion:");
        opcion = scan.next();
    }
    
    static void Mostrar(String identificador, double area){
        System.out.println("El area del " + identificador + " es " + area);
    }
}
