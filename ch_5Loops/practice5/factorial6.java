package ch_5Loops.practice5;

public class factorial6 {
    public static void main(String[] args) {
        int n = 5;
        int factorial =1 ;
        int i= 1;
   while (i<=n) {
  
    factorial *= i;
    i++;
   }
   System.out.println(factorial);
    }
    
}
