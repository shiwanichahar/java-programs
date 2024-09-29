package ch_7Methods;


public class recursive {
    static int factorial(int n){
        if (n==1 || n==0) {
            return 1;
             }
             else{
                return n * factorial(n-1);
             }
    }
    public static void main(String[] args) {
         System.out.println("The factorial is :" + factorial(5));
    }
    
}
