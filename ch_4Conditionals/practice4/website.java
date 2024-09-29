package practice4;
import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        System.out.println("Enter the website name : ");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
         if (name.endsWith(".com")) {
            System.out.println("This is a Commercial website");
            
         }
         else if (name.endsWith(".org")) {
            System.out.println("This is an Organisational website");
            
         } 
         else if (name.endsWith(".in")) {
            System.out.println("This is an Indian website");
            
         } 
    }
    
}
