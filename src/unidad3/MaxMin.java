package unidad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxMin {
    
    public static int maxi(int temp, int max){
        if(temp > max) return temp;
        return max;
    }
    
    public static int mini(int temp, int min){
        if(temp < min) return temp;
        return min;
    }
    
    public static void buscar(String path)throws FileNotFoundException{
        int max= 0, min= 0;
        
        File archivo = new File(path);
        Scanner keyb = new Scanner(archivo);
        
        if(keyb.hasNextLine()){
            max = keyb.nextInt();
            min = max;
        }
        
        while(keyb.hasNextLine()){
            try{
                int temp = keyb.nextInt();
                min = mini(temp, min);
                max = maxi(temp, max);
            }catch(Exception e){
                break;
            }
        }
        
        mostrar(max, min);
    }
    
    public static void mostrar(int max, int min){
        System.out.println("El número máximo es: " + max +
                            "\nEl número minimo es: " + min);
    }
}
