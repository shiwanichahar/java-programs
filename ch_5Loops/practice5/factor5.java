package ch_5Loops.practice5;

public class factor5 {
    public static void main(String[] args) {
        int n = 5;
       int factorial =1;
        for(int i = 1 ; i <=n ; i++) {
            factorial*=i;
         
        }
        System.out.print("The 5! is :");
        System.out.println(factorial);
    }
    
}
