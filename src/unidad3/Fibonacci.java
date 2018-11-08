package unidad3;

public class Fibonacci {
    
//    static long[] buff = new long[100];
//    
//    public static long fibonaccirec(int index){
//        if(buff[index] != 0) return buff[index];
//        
//        switch (index) {
//            case 0: buff[index] = 0;
//                    return 0;
//            case 1: buff[index] = 1;
//                    return 1;
//            default:buff[index - 1] = fibonaccirec(index-1);
//                    buff[index - 2] = fibonaccirec(index -2);
//                    return  buff[index - 1] + buff[index - 2];
//        }
//    }
//    
//    public static void imprimirrec(int index){
//        for(int i = 0; i < index; i++){
//            System.out.println(fibonaccirec(i));
//        }
//    }
    
    public static void fibonacci(int index){
        long c = 0;
        String resultado = "1 > ";
        
        resultado += c + "\n";
        for(long i = 1, a= 0, b = 1; i < index; i++, b = a, a = c){
            c=a+b;
            resultado += i+1 + " > " + c + "\n";
        }
        
        imprimir(resultado);
    }
    
    public static void imprimir(String out){
        System.out.println(out);
    }
}
