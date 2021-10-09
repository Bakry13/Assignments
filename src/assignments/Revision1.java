package assignments;

/*
 * Write a java program to enter
1- Size of the requested array
2- Array contents
3- Ask for an input "Replace" or "Separate" in "main method"
- if user choose "Replace" -> every number<=2 will be replaced by 0
every number >2 will be replaced by 5
ez: int arr[] = {3,5,0,1,2,33,2,43,1}
We should print
Binary array is: {1,1,0,0,0,1,0,1,0}

- if user choose "Separate"
 we should print number of every set of values seperated by value "0"
ex:
if int arr[] = {0,3,5,0,6,3,33,2,6,0,43,73,0}
We should print
Number of parts: 3
Size of parts: 2, 5, 2

if int arr[] = {3,5,0,6,3,33,2,6,0,43,73}
We should print
Number of parts: 3
Size of parts: 2, 5, 2

if int arr[] = {3,5,6,3,33,2,6,43,73}
We should print
Number of parts: 1
Size of parts: 9

Note:
- every operation "Replace" or "Separate"
 */
import java.util.Scanner;

public class Revision1 {
	
	public static void main(String[] args) {
		Operation1 op1 = new Operation1();
		Operation2 op2 = new Operation2();
		//Read array size
		System.out.println("Please enter array size:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size<1)
		{
			System.out.println("Wrong entry, please restart your program!");
		}
		else
		{
			int[] arr = new int[size];
			//Read array values
			System.out.println("Please enter array values:");
			for(int i=0; i<size; i++)
			{
				Scanner sc1 = new Scanner(System.in);
				int value = sc1.nextInt();
				arr[i] = value;
			}
			//Read operation
			System.out.println("Please enter the required operation:");
			Scanner sc2 = new Scanner(System.in);
			String operation = sc2.next();
			//Calling operation methods
			if(operation.toLowerCase().equals("r"))
			{
				op1.replace(arr);
			}
			else if(operation.toLowerCase().equals("s"))
			{
				op2.separate(arr);
			}
			else
			{
				System.out.println("Wrong entry, please restart your program!");
			}
		}
		}
}
