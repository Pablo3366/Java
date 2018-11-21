package unidad4;

public class Prueba {
    public static void main(String[] args){
        String[] nombres = {"Eduardo", "Sandra", "Diego", "Claudia"};
        String[] materias = {"Matematicas", "Ingles", "Programacion"};
        float[][] calif = new float[3][4];
        float[] promAlum = new float[4];
        float[] promMat = new float[3];
        
        TablaMatriz.capturar(calif, nombres, materias);
        
        //Calcula promedios
        TablaMatriz.avg(calif, promAlum, true);
        TablaMatriz.avg(calif, promMat, false);
        
        //Imprime tabla
        TablaMatriz.imprimir(calif, promAlum, promMat, nombres, materias);
        
        //Imprime mayor y menor
        TablaMatriz.imprimir(promAlum, nombres, true);
        TablaMatriz.imprimir(promMat, materias, false);
    }
}
