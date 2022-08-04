import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int size  =  scn.nextInt();
        int arr [] = new int[size];
        for(int i = 0;  i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        
        int miss_num = 1;
        for (int i = 2; i <= (arr.length + 1); i++) {
            miss_num += i;
            miss_num -= arr[i - 2];
        }


        System.out.println( "missing number "+ miss_num);
    

        
    }
    
}
