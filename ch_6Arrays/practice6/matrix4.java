package ch_6Arrays.practice6;

public class matrix4 {
    
    public static void main(String[] args) {
        
        int [][] matrix = new int [2][3];
       
            int [] [] mat1 = {{2, 3 ,4}, 
            {4,5,6}};
            int [] [] mat2 = {{2,3,4},
            {4,5,6}};
            int [][] result = {{0,0,0},
            {0,0,0}};
                     
      for( int i = 0 ; i<mat1.length ; i++){
        for(int j = 0 ; j<mat1[i].length; j++){
            
           
            result[i][j] = mat1[i][j]+ mat2[i][j];
            System.out.print(result[i][j]  +" ");
      }
      System.out.println("");
    } 
   
    }
}
