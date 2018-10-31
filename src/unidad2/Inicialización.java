package inicialización;


public class Inicialización {

    public static void main(String[] args) {
        byte edad = 19;
        short creditosCursados = 210;
        int númeroControl = 16240422;
        float promedio = 78.67f;
        char sexo = 'M';
        boolean inscrito = true;
        
        System.out.println("Alumn" + (sexo =='M'?"o":"a") +
                (inscrito?" inscrito":" dado de baja") + "\n" +
                "Numero de control : " + númeroControl + "\n" + 
                "Edad : " + edad + "\n" +
                "Créditos cursados : " + creditosCursados + "\n"+
                "Promedio : " + promedio);
    }
    
}
