package ch_7Methods;

public class methodsoverloading {
   // static void tellJoke(){
      //  System.out.println("I am phool");
        static void foo(int a){
            System.out.println("good moring "+ a + " bro!");
        }
        static void foo(int a,int b){
            System.out.println("good moring "+ a + " "+  b + " bro!");
        }
    
    public static void main(String[] args) {

   // tellJoke();
        
   foo(300);
foo(60 , 39);
    }
    
}