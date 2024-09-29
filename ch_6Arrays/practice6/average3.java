package ch_6Arrays.practice6;

public class average3 {
    public static void main(String[] args) {
        
        float[] marks = { 50 ,100,90,68,99};
      float  sum= 0;
        for( float elements : marks){
             sum = sum+elements ;
       
        }
        System.out.println("The average marks of physics is :" );
        System.out.println( sum/marks.length);
    }
    
}
