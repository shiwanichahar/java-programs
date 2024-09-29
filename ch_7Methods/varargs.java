package ch_7Methods;

public class varargs {
    static int sum( int ... arr ){
       int result = 0 ;
       for( int a : arr){
        result+=a;

       }
 return result;
    }
    public static void main(String[] args) {
         System.out.println(" Welcome to varargs Tutorial!");
         System.out.println("The sum of these no. is:" + "" + sum(2,3));
         System.out.println("The sum of these no. is:" + "" + sum(2,3,4));
         System.out.println("The sum of these no. is:" + "" + sum(2,3,5));
        }
        
        
        }

    
    

