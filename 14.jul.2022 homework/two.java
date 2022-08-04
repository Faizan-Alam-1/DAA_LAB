
public class two 
{
	
	public static void main (String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;

		int i = 0, j = n - 1;
	
		
		while (i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	
			
			i += 2;
			j -= 2;
		}


        for(int k= 0;  k<arr.length;k++){
            System.out.println(arr[k]);

        }
	

	
	}
}

