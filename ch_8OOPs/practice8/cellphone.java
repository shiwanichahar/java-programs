package ch_8OOPs.practice8;

public class cellphone {

    public void ringing(){
        System.out.println("ringing...");
    }
     public void Vibrating(){
        System.out.println("Vibrating...");
     }
    public static void main(String[] args) {
        
        cellphone ab = new cellphone();
        ab.Vibrating();
        ab.ringing();
    }
    
}
