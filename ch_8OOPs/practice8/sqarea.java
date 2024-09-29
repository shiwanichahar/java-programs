package ch_8OOPs.practice8;




    class square{
        int side;
        public  int area(){
 return side*side;
        }
         public int perimeter() {
 return  4*side;
         }
        }
         public class sqarea {
    public static void main(String[] args) {
   
        square sq = new square();
       sq.side=4;
       System.out.println("The area is :"+sq.area());
       System.out.println("The perimeter is :"+sq.perimeter());
    }
    
}
