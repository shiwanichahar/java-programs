package ch_9AccessModifiers.practice9;

class  cylindr{
     private int radius;
     private int height;
     public void setradius(int n){
        radius= n;
      }
      public int getradius(){
          return radius;
      }
      
      public void setheight(int i){
         height = i;
      }
      public int getheight(){
          return height;
      }
      public float sfarea(){
     
        return  2 * 3.14f * radius * radius +  2 * 3.14f * radius * height ;
      
      }
      public double volume(){
        return 3.14*radius* radius* height;
      }

      public cylindr(int r , int h){
        radius = r;
        height = h;
      }

}
public class cylinder {
    public static void main(String[] args) {
        
        cylindr mCylindr = new cylindr(10,4);
       // mCylindr.setradius(3);
       // mCylindr.setheight(4);

      System.out.println("The height is : "+mCylindr.getheight());  
       System.out.println("The radius is : "+mCylindr.getradius()); 

       System.out.println("The surface area is : "+mCylindr.sfarea());
       System.out.println("The volume is : "+mCylindr.volume());
       System.out.println();

    }

    
    
    
}

