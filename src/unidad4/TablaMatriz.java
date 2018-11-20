package unidad4;

import java.util.Scanner;

public class TablaMatriz {
    
    
    public void capturar(float[][] calif, float[] nombres, float[] materias){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < calif[0].length; i++){
            System.out.println("\n" + nombres[i]);
            
            for(int j = 0; j < calif.length; j++){
                System.out.print(materias[j] + ": ");
                calif[j][i] = in.nextFloat();
            }
        }
    }
    
    public void calcularAlum(float[][] calif){
        for(int i = 0, sum = 0; i < calif.length; i++){
            for(int j = 0; j < calif[0].length; j++){
                sum += calif[j][i];
            }
            
        }
    }
}
