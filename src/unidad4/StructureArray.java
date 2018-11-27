package unidad4;

public class StructureArray {

    public static void main(String[] args) {
        Pelicula[] lista = new Pelicula[3];
        
        for(int i = 0; i < lista.length; i++)
            lista[i] = new Pelicula();
        
        lista[0].titulo = "Pasajeros";
        lista[0].elenco = "Jennifer Lawrence & Chris Pratt";
        lista[0].duracion = 116;
        
        lista[1].titulo = "La chica del tren";
        lista[1].elenco = "Emily Blunt, Rebeca Ferguson, Haley Bennet & Justin Theroux";
        lista[1].duracion = 101;
        
        lista[2].titulo = "Sueño de campeones";
        lista[2].elenco = "Aaron Eckhart, Finn Wittrock, Robin Tunney & Sarah Bolger";
        lista[2].duracion = 118;
        
        for (Pelicula p : lista) {
            System.out.println(p.datos());
        }
    }
}

class Pelicula{
    String titulo, elenco;
    int duracion;
        
    String datos(){
    return titulo + "\n\t" + elenco + "\n\t" + duracion + " minutos";
    }
}
