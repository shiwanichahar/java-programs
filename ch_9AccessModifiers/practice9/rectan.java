package ch_9AccessModifiers.practice9;

class rectangle{
    public int length;
    public int breadth;

   public int getlength(){
    return length;
   }
   public int getbreadth(){
    return breadth;
   }
   
   public rectangle(){
    length = 4;
    breadth= 9;
   }
    public  rectangle(int l ,int b ){
   
length = l;
breadth = b;
    }
}
public class rectan {
    
    public static void main(String[] args) {
        rectangle myRectangle = new rectangle(3,5);
        
        System.out.println(myRectangle.length);
        System.out.println(myRectangle.breadth);
    }
}
