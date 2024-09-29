package ch_5Loops;

public class breaks {
    public static void main(String[] args) {
        
        for(int i =0;i<5;i++){
            System.out.println(i);
            System.out.println("JAAT ON TOP ");
            if (i==2) {
                System.out.println("This loop ends.");
                break;
                
            }
        }
     int a =0;
     while (a<5)
    
      {
        System.out.println(a);
        
        System.out.println("JAAT ON TOP ");
        
      
        if (a==2) {
            System.out.println("This loop ends.");
        break;
     }
     a++;
    }

    int b=0;
    do{ 
        System.out.println(b);
       
        System.out.println("JAAT ON TOP ");
        if (b==2) {
            System.out.println("This loop ends.");
        break;
     }
     b++; 
    }
    while(b<5);
    
}
}
