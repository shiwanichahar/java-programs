package ch_6Arrays.quickquiz;

public class reverse1 {
    public static void main(String[] args) {
    
        int[] marks = {100,98,79,97,88};
       
        for(int i=marks.length-1; i>=0 ;i--)
        System.out.println(marks[i]);

        //for each loop 
        System.out.println("Using for each loop");
        for( int element : marks){
        System.out.println(element);
    }
     }
     
}
