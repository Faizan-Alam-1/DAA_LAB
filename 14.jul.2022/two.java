// Find Third largert and Second smallest in array by using any function. 
// method : Bruteforce approach   

import java.util.*;

public class two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Fill the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr);

       

        System.out.println("Third Largest");
        System.out.println(arr[2]);
        System.out.println("Second smallest");
        System.out.println(arr[1]);

    }

}