import java.util.Scanner;

public class cbse {
    public static void main(String[] args) {
        System.out.println("The marks of 5 subject are :");
        Scanner sc = new Scanner(System.in);
        System.out.println(" marks of maths- ");
        float maths = sc.nextFloat();
        System.out.println("marks of chemistry- ");
        float chemistry = sc.nextFloat();
        System.out.println(" marks of physics-");
        float physics = sc.nextFloat();
        System.out.println(" marks of hindi-");
         float hindi = sc.nextFloat();
        System.out.println(" marks of physical Education-  ");
        float phyedu = sc.nextFloat();
System.out.println("Marks Obtained:");
        System.out.println(maths+chemistry+physics+hindi+phyedu);

       System.out.println(" Total marks = 500"); 

       System.out.println("The percentage is : ");
        float percentage = (maths+chemistry+physics+hindi+phyedu)*100/500 ;
        System.out.println(percentage);

    }
    
}
