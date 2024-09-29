package ch_7Methods.practice7;

public class average6 {
    static int average(int...arr){
        int result = 0;
        for(int a :arr){
            result+=a;
        }
        return result/arr.length;
    }
    public static void main(String[] args) {
        System.out.println(average(10,20,30,40));
        
    }
    
}
