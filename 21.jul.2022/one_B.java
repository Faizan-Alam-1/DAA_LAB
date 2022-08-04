// Find the sum of the elements above the leading diagonal.
public class one_B {
    public static void main(String[] args) {
        int[][] arr = {
                { 2, 4, 6 },
                { 3, 5, 7 },
                { 3, 2, 9 },
        };

        int sum = 0;
        int pro = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j) {
                    sum = sum + arr[i][j];
                    pro = pro* arr[i][j];
                }
            }
           
            
        }

        System.out.println("Sum of leading digonal is : " + sum );
        System.out.println("Product of leading digonal is : " + pro );

    }

}
