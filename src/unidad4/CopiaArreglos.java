package unidad3;

import java.util.Arrays;

public class CopiaArreglos {

    public static void main(String[] args) {
        String [] carreras = {"ii","ige","iem","isc"};
        String [] copia = carreras.clone();
        
        System.out.println(copia + " contiene " + Arrays.toString(copia));
        System.out.println(carreras + " contiene " + Arrays.toString(carreras));
    }
    
}
