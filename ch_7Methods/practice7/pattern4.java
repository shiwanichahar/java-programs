package ch_7Methods.practice7;

public class pattern4 {
    static void pattern(int a){
        for( int i= a;i>0 ;i-- ) {
            for(int j=0; i>j ;j++){
              System.out.print("*");
        }
              System.out.println("");
             }
    }
    public static void main(String[] args) {
         pattern(4);
    }
}
