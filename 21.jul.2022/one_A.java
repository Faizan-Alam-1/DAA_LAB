// Find the number of nonzero elements in A

import java.util.*;

public class one_A {
    public static void main(String[] args) {
      
    //     Scanner scn =  new Scanner(System.in);
    //     int size = scn.nextInt();
    //    int [][] arr = new int[size][size];
    //    for(int i  = 0;  i<size; i++){
    //     for(int j = 0;  j<size; j++){
    //        arr[i][j] = scn.nextInt();
    //     }
    //    }

      int [][] arr = {
        {2,4,6,6},
        {3,5,7,0},
        {3,2,0,7},
      };


       for(int i = 0; i<arr.length; i++){
         for(int j  = 0; j<arr[i].length; j++){
            if(arr[i][j]!=0){
                System.out.print(arr[i][j]+" ");   
            }
         }
         System.out.println();
       }




    }

    
}