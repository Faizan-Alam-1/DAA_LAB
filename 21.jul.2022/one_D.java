// Find the product of the diagonal elements.

public class one_D {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, 6 },
                { 3, 5, 7 },
                { 3, 2, 9 },
        };


        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j) {
                
                    pro = pro* arr[i][j];
                }
            }
           
            
        }

        System.out.println("Product of leading digonal is : " + pro );

    }

}

    

