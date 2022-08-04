

//Write an algorithm for finding counting inversions in an array. Inversion is a
//air such that for an array A = {a1, a2, a3,...., an}, and ai > aj and i < j.

public class one {
	

	public static void main(String[] args)
	{
         int arr[] = new int[] { 1, 20, 6, 4, 5 };

        int inv_count = 0;
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] > arr[j])
					inv_count++;


		System.out.println("Number of inversions are "
						+ inv_count);
	}
}
