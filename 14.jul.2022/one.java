// Find minimum and maxuman number from array. user has to give in put from console;

// method : Bruteforce approach  

import java.util.*;
public class one {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size =  scn.nextInt();
        int [] arr = new int [size];
        System.out.println("Fill the array");
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        // main logic 
     
        int max = arr[0];
        int min = arr[0];
        for(int i = 0;  i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i = 0; i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println( "Min number in arr" +" "+ min);
        System.out.println(  "Max number in arr"  +" "+ max);


    }

    
}