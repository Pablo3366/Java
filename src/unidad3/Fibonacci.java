package unidad3;

public class Fibonacci {
//    public static int fibonaccirec(int index){
//        if(index <= 1) return 1;
//        else{
//            return fibonaccirec(index-1) + fibonaccirec(index -2);
//        }
//    }
//    
//    public static void imprimirre(){
//        for(int i = 0; i < 50; i++){
//            System.out.println(fibonaccirec(i));
//        }
//    }
    
    public static void fibonacci(int index){
        int c = 0;
        
        for(int i = 0, a= 0, b = 1; i < index; i++, b = a, a = c){
            c=a+b;
            System.out.println(c);
        }
        System.out.println(c);
    }
}
