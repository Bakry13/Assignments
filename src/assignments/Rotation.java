package assignments;

public class Rotation {
	
	public void rightRotation(int arr[], int rotationSize)
	{
		int[] rotatedElements = new int[rotationSize];
		int arraySize = arr.length;
		//===================Move the last elements to the temp array================
		for(int i=0; i<rotationSize; i++)
		{
			rotatedElements[i] = arr[arraySize-rotationSize+i];
			System.out.println(rotatedElements[i]);
		}
		//===================move the rest of elements================
		for(int j=arraySize-rotationSize-1; j>=0; j--)
		{
			arr[j+rotationSize] = arr[j];
		}
		//===================Move the temp array to the new array================
		for(int i=0; i<rotationSize; i++)
		{
			arr[i] = rotatedElements[i];
		}
	}
	
	
	
	public void leftRotation(int arr[], int rotationSize)
	{
		int[] rotatedElements = new int[rotationSize];
		int arraySize = arr.length;
		//===================Move the first elements to the temp array================
		for(int i=0; i<rotationSize; i++)
		{
			rotatedElements[i] = arr[i];
		}
		//===================move the rest of elements================
		for(int j=rotationSize; j<arraySize; j++)
		{
			arr[j-rotationSize] = arr[j];
		}
		//===================Move the temp array to the new array================
		for(int i=0; i<rotationSize; i++)
		{
			arr[arraySize-rotationSize+i] = rotatedElements[i];
		}
	}

}
