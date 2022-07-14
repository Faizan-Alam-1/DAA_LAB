// find total number of dublicate number By By bruteforce approce  

import java.util.*;

public class thrid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scn.nextInt();
        int arr[] = new int[size];
        System.out.println("fill the array");
        for(int i = 0;  i< arr.length; i++){
              arr[i] = scn.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;

                }
            }

        }

        System.out.println("Total duplicate number is :");

        System.out.println(count);

    }

}
