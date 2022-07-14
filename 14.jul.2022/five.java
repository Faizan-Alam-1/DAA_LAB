// Swapping the element. By using funtion.
// method : Bruteforce approach  
 
import java.util.*;
public class five {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arr  = new ArrayList<>();
        System.out.println("Enter first number");
        int num1 =  scn.nextInt();
        System.out.println("Enter second number");
        int num2 = scn.nextInt();
        System.out.println("Enter third number");
        int num3 = scn.nextInt();
        arr.add(num1);
        arr.add(num2);
        arr.add(num3);
      
        Collections.swap( arr, 0 ,2);
        System.out.println("swap number");
        for(int i = 0;  i<arr.size(); i++){
            System.out.print(" "+arr.get(i));
        }
        
        
    }

    
}