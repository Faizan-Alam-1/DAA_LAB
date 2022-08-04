// Display the elements the  diagonal.

public class one_c {
    public static void main(String[] args) {
        int[][] arr = {
            { 2, 4, 6 },
            { 3, 5, 7 },
            { 3, 2, 0 },
        };
      
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j){
                    System.out.print(arr[i][j]);
                }
               
            }

            System.out.println();
        }

    }
    
}
