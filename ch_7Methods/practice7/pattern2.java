package ch_7Methods.practice7;

public class pattern2 {
    static void pattern(int a){
        for(int i=0 ;i<a ;i++){
            for(int j = 0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
            }
        }
       
    public static void main(String[] args) {
        pattern(4);
    }
    
}
