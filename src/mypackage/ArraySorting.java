package mypackage;

public class ArraySorting {

	public static void main(String[] args) {

		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
		int arrLength = arr.length;

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		
		int temp = arr[0]; // initialize to first array element
		for (int i = 0; i < arrLength; i++)
		{
			for (int j = i; j < arrLength; j++)
			{
				if (arr[j] < arr[i])
				{
					// swap the values in two slots
					temp = arr[j]; // current lowest num
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arrLength; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
		
	}

}
