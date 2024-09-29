package ch_5Loops;

public class  continuel {
    public static void main(String[] args) {
   
        for(int a = 0; a<=5 ;a++){

            if (a==3) {
                System.out.println("Three");
                continue;
            }
            System.out.println(a);
           
        } 

        int b = 0;
        do{
            b++;
            if (b==4) {
                System.out.println("Four");
            } 
            System.out.println(b);
            
        }while(b<5);
     

        int c=0;
        while (c<5) {
            c++;
            if (c==2) {
                System.out.println("Two");
            }
            System.out.println(c);
        }
        
    }

     }