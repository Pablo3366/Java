/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;
import java.util.Scanner;
/**
 *
 * @author lap
 */
public class Tiempo {
    int dias, año, mes;
    String nombre;
    
    public void capturar(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el año: ");
        año = scan.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = scan.nextInt();
    }
    
    public boolean calcular(int año){
        if(año % 4 == 0){
            return true;
        }else return false;
    }
    
    public void determinar(){
        if(mes == 1){
            dias = 31;
            nombre = "Enero";
            Muestra(dias, nombre);
        }else if(mes == 2){
            if(calcular(año)) dias = 29;
            else dias = 28;
            nombre = "Febrero";
            Muestra(dias, nombre);
        }else if(mes == 3){
            dias = 31;
            nombre = "Marzo";
            Muestra(dias, nombre);
        }else if(mes == 4){
            dias = 30;
            nombre = "Abril";
            Muestra(dias, nombre);
        }else if(mes == 5){
            dias = 31;
            nombre = "Mayo";
            Muestra(dias, nombre);
        }else if(mes == 6){
            dias = 30;
            nombre = "Junio";
            Muestra(dias, nombre);
        }else if(mes == 7){
            dias = 31;
            nombre = "Julio";
            Muestra(dias, nombre);
        }else if(mes == 8){
            dias = 30;
            nombre = "Agosto";
            Muestra(dias, nombre);
        }else if(mes == 9){
            dias = 31;
            nombre = "Septiembre";
            Muestra(dias, nombre);
        }else if(mes == 10){
            dias = 30;
            nombre = "Octubre";
            Muestra(dias, nombre);
        }else if(mes == 11){
            dias = 31;
            nombre = "Noviembre";
            Muestra(dias, nombre);
        }else if(mes == 12){
            dias = 30;
            nombre = "Diciembre";
            Muestra(dias, nombre);
        }else System.out.println("Ingrese un numero valido");
    }
    
    public void Muestra(int dias, String nombre){
        System.out.println(nombre + "cuenta con " + dias + " dias");
    }
}
