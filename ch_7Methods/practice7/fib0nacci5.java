package ch_7Methods.practice7;

public class fib0nacci5 {
    static int fib( int n){
         if (n==1) {
            return 0;
         }
         else if (n==2){
            return 1;
         }
         else{
            return fib(n-1)+fib(n-2);
         }
    }
    //fabonacci series 0,1,1,2,3,5,8,13,21,34
    public static void main(String[] args) {
         int c = fib(10);
         System.out.println(c);
    }
    
}
