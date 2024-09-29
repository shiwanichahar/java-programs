public class logical {
    public static void main(String[] args) {
        
    System.out.println("for Logical AND...");
         Boolean a = true ;
        Boolean b = false ;
        Boolean c = true ;

        if (a&&b&&c) {
            System.out.println("yes");
         }     
        else{
            System.out.println("no");
        }
         System.out.println("for Logical OR ");
        Boolean a1 = true ;
        Boolean b1 = false ;
        Boolean c1 = true ;

        if (a1||b1||c1) {
            System.out.println("yes");
            
        }
        else{
            System.out.println("no");
        }
      System.out.println("for Logical NOT ...");

      System.out.print("not a is ");
      System.out.println(!a);
      System.out.print( "not b is ");
      System.out.println(!b);
    
    }
    
}
