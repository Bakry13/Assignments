package firstPackage;

import java.util.Scanner;

public class SecondClass {

	String color = "red";
	int speed = 120;
	
	int evenNumbers()
	{
		System.out.println("Enter size of the array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		int sum = 0;
		System.out.println("Enter array contents:");
		for (int i =0; i<size; i++)
		{
			Scanner sc1 = new Scanner(System.in);
			int value = sc1.nextInt();
			arr[i] = value;
			if (value%2 == 0)
			{
				sum++;
			}
		}
		System.out.println("number of even numbers = "+sum);
		return sum;
	}
	
	public static void main(String[] args) {
	}
}
