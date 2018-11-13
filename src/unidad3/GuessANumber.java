package unidad3;

import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {
        Random random =  new Random();
        int secretNumber = random.nextInt(10) + 1;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Estoy pensando en un numero" +
                "entre el 1 y el 10. ¿Cual es? ");
        int guess = scan.nextInt();
        
        if(guess < 1 || guess > 10){
            System.out.println("Bueno, si no quieres intentarlo, " + 
                    "yo tampoco quiero jugar. ");
        }else{
            if(guess == secretNumber)
                System.out.println("Bravo, ganaste");
            else{
                System.out.println("El numero fue " + secretNumber);
                
                if(Math.abs(guess - secretNumber) > 3)
                    System.out.println("Fallaste por mucho!");
                else
                    System.out.println("Estuviste cerca");
                System.out.println("Mejor suerte a la próxima");
            }
        }
    }
    
}
