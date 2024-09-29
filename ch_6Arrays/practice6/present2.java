package ch_6Arrays.practice6;

public class present2 {
    public static void main(String[] args) {
         int [] marks = { 70,90,80,95,60};
         int num = 90 ;
       
        for( int element : marks){
        if ( num == element) {
             System.out.println("The value is present in the array");
        } 
         else{
            System.out.println("The value is not present in the array");
         }
         break;
    }
  
        
    }
    
}
