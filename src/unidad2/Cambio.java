package pruebacambio;
import java.util.Scanner;

public class Cambio {
    int cantidad;
    int b500, b200, b100, b50, b20,
        m10, m5, m2, m1;
    
    void run(){
        capturar();
        calcular();
        imprimir();
    }
    
    void capturar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Programa para calcular la cantidad");
        System.out.println("de billetes y monedas");
        System.out.println("una cantidad de un cheque");
        System.out.print("Ingrese cantidad >>> ");
        cantidad = teclado.nextInt();
    }
    
    void calcular(){
        b500 = cantidad / 500;
        b200 = cantidad % 500 / 200;
        b100 = cantidad % 500 % 200 / 100;
        b50  = cantidad % 500 % 200 % 100 / 50;
        b20  = cantidad % 500 % 200 % 100 % 50 / 20;
        m10  = cantidad % 500 % 200 % 100 % 50 % 20 / 10;
        m5   = cantidad % 500 % 200 % 100 % 50 % 20 % 10 / 5;
        m2   = cantidad % 500 % 200 % 100 % 50 % 20 % 10 % 5 / 2;
        m1   = cantidad % 500 % 200 % 100 % 50 % 20 % 10 % 5 % 2;
    }
    
    void imprimir(){
        System.out.println("En $" + cantidad + " hay");
        System.out.println(b500 + " billetes de $500");
        System.out.println(b200 + " billetes de $200");
        System.out.println(b100 + " billetes de $100");
        System.out.println(b50  + " billetes de $50");
        System.out.println(b20  + " billetes de $20");
        System.out.println(m10  + " monedas de $10");
        System.out.println(m5   + " monedas de $5");
        System.out.println(m2   + " monedas de $2");
        System.out.println(m1   + " monedas de $1");
    }
}
