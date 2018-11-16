package unidad3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Filter{
    int[]   nums, temp,
            impares = new int[0], multiplos = new int[0];
    
    public void run(){
        capturar(20, true);
        calcular();
        imprimir();
    }
    
    public void capturar(int longitud, boolean rand){
        Scanner in = new Scanner(System.in);
        nums = new int[longitud];
        
        for(int i = 0; i < longitud; i++){
            System.out.print("Ingrese el número [" + (i+1) + "]: ");
            if(rand){
                nums[i] = new Random().nextInt(50);
                System.out.println(nums[i]);
            }else nums[i] = in.nextInt();
        }
    }
    
    public void calcular(){
        impares = filter(2, 1, impares);
        multiplos = filter(6, 0, multiplos);
    }
    
    public void imprimir(){
        System.out.println("\nNumeros ingresados: \t" + Arrays.toString(nums));
        System.out.println("Impares: \t\t" + Arrays.toString(impares));
        System.out.println("Multiplos: \t\t" + Arrays.toString(multiplos));
    }
    
    public int[] ingresar(int num, int[] arr){
        temp = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) temp[i] = arr[i];
        temp[temp.length - 1] = num;
        
        return temp;
    }
    
    public int[] filter(int multi, int res, int [] arr){
        for(int i = 0; i < nums.length; i++){
            if(nums[i]%multi == res){
                arr = ingresar(nums[i], arr);
            }
        }
        return arr;
    }
}
