package unidad4;

public class ObjetosComoParametros {

    /*
     Aqui utilizamos arreglos de objetos como parametros
     
    Catalogo es un arreglo de pelicaulas que se inicializa en
    un metodo y se imprimie en otro.
    
    Note que catalofo se pasa como parametro en cada llamada
     */
    public static void main(String[] args) {
        ObjetosComoParametros app = new ObjetosComoParametros();
        Pelicula[] catalogo = new Pelicula[3];
        
        app.inicializar(catalogo);
        app.imprimir(catalogo);
    }
    
    void inicializar(Pelicula[] catalogo){
        for(int i = 0; i < catalogo.length; i++)
            catalogo[i] = new Pelicula();
        
        catalogo[0].titulo = "Pasajeros";
        catalogo[0].elenco = "Jennifer Lawrence & Chris Pratt";
        catalogo[0].duracion = 116;
        
        catalogo[1].titulo = "La chica del tren";
        catalogo[1].elenco = "Emily Blunt, Rebeca Ferguson, Haley Bennet & Justin Theroux";
        catalogo[1].duracion = 101;
        
        catalogo[2].titulo = "Sueño de campeones";
        catalogo[2].elenco = "Aaron Eckhart, Finn Wittrock, Robin Tunney & Sarah Bolger";
        catalogo[2].duracion = 118;
        
    }
    
    void imprimir(Pelicula[] catalogo){
        
        for (Pelicula p : catalogo) {
            System.out.println(p.datos());
        }
    }
}