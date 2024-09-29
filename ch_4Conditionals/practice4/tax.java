package practice4;
import java.util.Scanner;
public class tax {
    public static void main(String[] args) {
        System.out.println("Enter the income in lakhs per annum:");
        Scanner sc= new Scanner(System.in);
        float income= sc.nextFloat();
        float tax = 0;

        System.out.println("The tax paid by the employee is :");

    if (income<=2.5) {
  tax= tax + 0 ;
  System.out.println(tax);
         }

         else if (income >2.5 && income <=5){
            tax= tax + 0.05f *(5.0f -2.5f) ;
            System.out.println(tax);
         }

         else if (income >5 && income <=10){
            tax= tax + 0.05f *(5.0f -2.5f) ;
            tax= tax + 0.2f *(10.0f -5f) ;
            System.out.println(tax);
         }

         else if (income >10 ){
            tax= tax + 0.05f *(5.0f -2.5f) ;
            tax= tax + 0.2f *(10.0f -5f) ;
            tax= tax + 0.3f *(income-10f) ;
            System.out.println(tax);
         }
        
    }
}
