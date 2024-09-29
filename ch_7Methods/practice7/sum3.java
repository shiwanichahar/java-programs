package ch_7Methods.practice7;

import practice1.sum;

public class sum3 {
    static int recursion (int n){
        if (n==1) {
            return 1;   
        }
        return n + recursion(n-1);
    }
    public static void main(String[] args) {
        int c= recursion(4) ;
        System.out.println(c);
      
        
    }
    
}
