package firstPackage;

import java.util.Scanner;

public class FirstClass extends SecondClass{
	
	static void swap(int arr[], int i, int j)
	{
		int temp =0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int arr[] = {4,7,3,9};
		swap(arr, 1, 2);
		System.out.println(arr[1]+ " "+arr[2]);
	}
}