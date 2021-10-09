package assignments;

import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		System.out.println("Please Enter a number from 0 to 127!");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		if (number<0 || number> 127)
		{
			System.out.println("Please enter a number from 0 to 127 as the result will be calculated only on the first byte!");
		}
		int oneTest = 0;
		int oneSum = 0;
		for (int i = 0; i<8; i++)
		{
			oneTest = number&(1<<i);
			if (oneTest != 0)
			{
				oneSum++;
			}
			oneTest = 0;
		}
		System.out.println("Total number of ones on the first byte of the entered number = "+oneSum);
	}
}
