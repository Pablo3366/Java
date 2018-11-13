package unidad3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Operaciones {
    double fp1, fp2;
    String operationS;
    char operation;
    
    public void capturar(){
        
        System.out.println("Bienvenido a la calculador simple");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Introduzca el primer numero: ");
        fp1 = scan.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        fp2 =  scan.nextDouble();
        
        System.out.println("\nLas operaciones son:" +
                "\n\t + para sumar" +
                "\n\t - para restar" +
                "\n\t * para multiplicar" +
                "\n\t / para dividir");
        
        System.out.print("Introduzca su selección: ");
        operationS = scan.next();
    }
    
    public void mostrar(){
        operation = operationS.charAt(0);
        
        switch(operation){
            case '+':
                System.out.println("La suma es: " + sumar());
                break;
            case '-':
                System.out.println("La resta es: " + restar());
                break;
            case '*':
                System.out.println("El producto es: " + multiplicar());
                break;
            case '/':
                if(fp2 == 0) System.out.println("No se puede dividir entre 0");
                else System.out.println("El cociente es: " + dividir());
                break;
            default: System.out.println(operation + " no es valida");
        }
    }
    
    public String sumar(){
        DecimalFormat twoDecimals = new DecimalFormat("#,###,###.##");
        return twoDecimals.format(fp1 + fp2);
    }
    
    public String restar(){
        DecimalFormat twoDecimals = new DecimalFormat("#,###,###.##");
        return twoDecimals.format(fp1 - fp2);
    }
    
    public String multiplicar(){
        DecimalFormat twoDecimals = new DecimalFormat("#,###,###.##");
        return twoDecimals.format(fp1 * fp2);
    }
    
    public String dividir(){
        DecimalFormat twoDecimals = new DecimalFormat("#,###,###.##");
        return twoDecimals.format(fp1 / fp2);
    }
            
}
