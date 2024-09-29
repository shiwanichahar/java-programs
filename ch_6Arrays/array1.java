package ch_6Arrays;

public class array1 {
    public static void main(String[] args) {
       // There are three main ways to declare an array
         /* 1.Declaration and memory allocation :
           int [] marks = new int[5] ;  

           Initialization:
             marks [0]=100;
             marks [1]=90;
             marks [2]=80;
             marks [3]=100;
             marks [4]=90;
           System.out.println(marks[4]);
         */
       /*
        2.Declaration :
         int [] marks ;
         Memory allocation :
          marks = new int[5];
          Initialization:
             marks [0]=100;
             marks [1]=90;
             marks [2]=80;
             marks [3]=100;
             marks [4]=90;
           System.out.println(marks[4]);
        */


 //3.Declaration, Memory allocation,Initialization :
 int[] marks = { 100 ,90,80 ,100,90};
 System.out.println(marks[3]);
 System.out.println(marks.length);

    }
    
}
