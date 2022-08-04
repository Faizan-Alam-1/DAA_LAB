

//Write a program to swap pair of elements of an array of n integers from starting.
// If n is odd, then last number will be remain unchanged.

public class one {
    public static void main(String[] args) {
        int [] arr  = {2,4,2,5,6,7};
       
        int [] arr2 = new int[arr.length];
        for(int i = 0 ; i< arr.length;i++){
            int prod = arr[i];
           
            for(int j = 1; j<arr.length; j++){
                prod *= arr[j];
            }

            arr2[i] = prod;

        }



        
       
         

      


        for(int i = 0;  i< arr2.length;  i++){
            System.out.println(arr[i]+"  ");
        }


        
    }

    
}