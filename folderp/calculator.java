package folderp;
  import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
       System.out.println(" Welcomes you!");  
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1 :");
        double num1 = sc.nextDouble();
         System.out.println("Choose one operator : + ,-,*,/,%");
      String operator = sc.next();
      System.out.println("Enter a number 2 :");
      double num2 = sc.nextDouble();
      double result = 0;
      switch (operator){
        case"+" :
            result = num1+num2;
            break;
         case"-" :
            result = num1-num2;
            break;
            case"*" :
            result = num1*num2;
            break;
            case"/" :
            if (num2==0) {
               System.out.println("Divided by zero is not allowed !"); 
            }
            else{
                result = num1/num2;
            }
           
            break;
            case"%" :
            if (num2==0) {
                System.out.println("Divided by zero is not allowed !");  
            }
            else{
                result = num1%num2;
            }
           break;
        default:
        System.out.println("invalid input!");
        System.out.println("Result :" + result );
}
}
}
