package literales;

public class Literales {

    public static void main(String[] args) {
        //Cuatro cero en hexadecimal, corresponde a 64 en decimal (caracter @)
        int arroba = 0x40;
        long chinos = 1357000000L;
        
        
        //Necesitamps que el 64 se convierta al imbolo @, para ello el cast
        System.out.println((char)arroba + " es el caracter #" + arroba);
        System.out.println("En 2013 había " + chinos + " chinos");
    }
    
}