package assignments;

import java.util.Scanner;

public class Revesion2 {
	
	public static void main(String[] args) {
		Rotation rotation = new Rotation();
		int size = 0;
		int rotationSize = 0;
		String rotationDirection = "R";
		//=========================Read array size===============================
		System.out.println("Please enter array size:");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		int[] arr = new int[size];
		if (size<1)
		{
			System.out.println("Wrong entry, please restart your program!");
		}
		else
		{
			//Read array values
			System.out.println("Please enter array values:");
			for(int i=0; i<size; i++)
			{
				Scanner sc1 = new Scanner(System.in);
				int value = sc1.nextInt();
				arr[i] = value;
			}
		}
		//=====================Read size of rotation=======================
		if (size>0)
		{
			System.out.println("Please enter rotation size:");
			Scanner rotationSizeScanner = new Scanner(System.in);
			rotationSize = rotationSizeScanner.nextInt();
			if (size<rotationSize || rotationSize<1 )
			{
				System.out.println("Wrong entry, rotation size must be lower than array size and larger than 0, please restart your program!");
			}
		}
		//=====================Read direction of rotation=======================
		if (size>0 && size>rotationSize && rotationSize>0)
		{
			System.out.println("Please enter direction of rotation (\"R\" for Right and \"L\" for Left)");
			Scanner rotationDirectionScanner = new Scanner(System.in);
			rotationDirection = rotationDirectionScanner.next();
			if (rotationDirection.toUpperCase().equals("R"))
			{
				rotation.rightRotation(arr,rotationSize);
			}
			else if (rotationDirection.toUpperCase().equals("L"))
			{
				rotation.leftRotation(arr, rotationSize);
			}
			else
			{
				System.out.println("Wrong entry, please restart your program!");
			}
		}
		//=====================Printing the array================================
		System.out.print("Array values:\n{ ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("}");
	}
}
