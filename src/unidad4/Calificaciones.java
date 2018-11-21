package unidad4;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] nombres = {"Eduardo", "Sandra", "Diego", "Claudia"};
        String[] materias = {"Matematicas", "Ingles", "Programacion"};
        float[][] calif = new float[3][4];
        
        for(int i = 0; i < calif[0].length; i++){
            System.out.println("\n" + nombres[i]);
            
            for(int j = 0; j < calif.length; j++){
                System.out.print(materias[j] + ": ");
                calif[j][i] = in.nextFloat();
            }
        }
        
        System.out.println("");
        
        for(int i = 0; i < calif[0].length; i++){
            for(int j = 0; j < calif.length; j++){
                if(calif[j][i] < 70)
                    System.out.println(nombres[i] + " reprobo " + materias[j]);
            }
        }
    }
}

