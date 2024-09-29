package ch_6Arrays.practice6;

public class float1 {
    public static void main(String[] args) {
        float [] marks = {40.5f , 60.5f , 66.0f ,70.5f,80.5f };
        float sum = 0 ;
        for( float elements : marks){
          
           sum= sum + elements ;
           
        }
        System.out.println(sum);
        
    }
    
}
