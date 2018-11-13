package unidad3;

public class Fibonacci {
    
    static long[] buff = new long[100];
    
    public static long fibonaccirec(int index){
        if(buff[index] != 0) return buff[index];
        
        switch (index) {
            case 0: buff[index] = 0;
                    return 0;
            case 1: buff[index] = 1;
                    return 1;
            default:buff[index - 1] = fibonaccirec(index-1);
                    buff[index - 2] = fibonaccirec(index -2);
                    return  buff[index - 1] + buff[index - 2];
        }
    }
    
    public static void imprimirrec(int index){
        for(int i = 0; i < index; i++){
            System.out.println(fibonaccirec(i));
        }
    }
    
    public static String fibonacci(int index){
        String resultado = "";
        
        for(long i = 1, a = 0, b = 1, c; i < index; i++, b = a, a = c){
            c=a+b;
            resultado += i+1 + " > " + c + "\n";
        }
        
        return resultado;
    }
    
    public static void imprimir(){
        String resultado = "1 > ";
        
        resultado += 0 + "\n";
        
        System.out.println(resultado + fibonacci(50));
    }
}
