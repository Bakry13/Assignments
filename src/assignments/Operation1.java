package assignments;

import java.util.Scanner;

public class Operation1 {
	public void replace(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			if (arr[i] <= 2)
			{
				arr[i] = 0;
			}
			else
			{
				arr[i] = 1;
			}
		}
		System.out.print("Array values after replacement:\n{ ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("}");
	}
}
