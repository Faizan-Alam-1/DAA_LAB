import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

// dGiven key in a sorted array A with distinct values.
// Write a program to find i, j, k such that A[i] + A[j] + A[k] == key
public class four {
    public static void main(String[] args) {
        Scanner scn  =  new Scanner(System.in);
        int size  =  scn.nextInt();
        int [] arr =  new  int[size];
        int sum = 0;
        for(int i =  0;  i<size ;  i++){
            sum += arr[i];

        }
        System.out.println( "sum is : "+sum);



        


    }

    
}