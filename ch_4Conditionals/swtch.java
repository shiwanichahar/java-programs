import java.util.Scanner;
public class swtch {
    public static void main(String[] args) {

            System.out.println("Enter the age:");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt();
    
            switch(age){
                case 18:
                System.out.println("You are an adult!");
                break;
                case 22:
                System.out.println("You are ready to get a job!");
                break;
                case 60:
                System.out.println("You are ready to get retired!");
                break;
            default:
            System.out.println("Kacche Kato Sawaad Lo!");
            }
        }
    }
    
    

