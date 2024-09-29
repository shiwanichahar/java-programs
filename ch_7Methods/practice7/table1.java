package ch_7Methods.practice7;

public class table1 {
    static int multiply(int a){
        for(int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d \n" ,a,i,a*i);
        }
return a;
    }
    public static void main(String[] args) {
        
multiply(7);
    }
    
}
