package unidad3;

public class PrintEven {

    public static void main(String[] args) {
        String toPrint = "";
        
        for(int i = 0; i <= 20; i+=2){
            toPrint += i + " ";
        }
        System.out.println(toPrint);
    }
    
}
