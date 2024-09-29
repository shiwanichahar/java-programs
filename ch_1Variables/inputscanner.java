 
 import java.util.Scanner;
public class inputscanner {
    public static void main(String[] args) {
        
        System.out.println("Taking Input from User ");

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sc.nextInt();
       System.out.println("Enter number 2");
        int b = sc.nextInt();
        System.out.println("The sum is ");
          int sum = a + b;
        System.out.println(sum);

      //  boolean b1 = sc.hasNext();
      //  System.out.println(b1);

       //  String sr = sc.next();
       //  System.out.println(sr);

    }
}