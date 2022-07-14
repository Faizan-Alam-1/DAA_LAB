// how many time element is present in array.
// method : Bruteforce approach  

// Input 1 : 2,3,3,5,5
// input 2 : 1, 2, 3, 4, 2, 7, 8, 8, 3


import java.util.*;

public class four {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Fill the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("Repated Element are : -");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    
                    System.out.print(arr[j] + " ");
                   
                }


            }

          
           
         
            
        }

    }

}
