package practice4;
import java.util.Scanner;
public class passfail {

   public static void main(String[] args) {
    System.out.println("SUBJECT MARKS OUT OF 100 :");
    Scanner sc = new Scanner(System.in);
    System.out.println("Marks of maths :");
    float maths = sc.nextFloat();
    System.out.println("Marks of physics :");
    float phy = sc.nextFloat();
    System.out.println("Marks of chemistry:");
    float chem = sc.nextFloat();

    System.out.println("PERCENTAGE IS :");
    float percentage = (maths+phy+chem)*100/300;
    System.out.println(percentage);

    if(percentage >= 40&& maths>=33 && phy >= 33 && chem >=33 ) {
        System.out.println("Pass"); 
    }
    else{
        System.out.println("Fail");
    }
   } 
}
