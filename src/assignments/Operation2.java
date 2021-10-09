package assignments;

public class Operation2 {
	public void separate(int arr[])
	{
		int partsNumb = 0;
		int partsSize = 0;
		int size = arr.length;
		int[] partsArr = new int[size];
		//Calculate partsNumb
		for(int i=1; i<size; i++)
		{
			if (((arr[i] == 0)&&(arr[i-1] != 0)) || ((arr[i] != 0)&&(i == size-1)))
			{
				partsNumb++;
			}
		}
		//Check if the array size is one
		if (size == 1 & arr[0] != 0)
		{
			partsNumb++;
		}
		//Calculate parts size
		int j = 0;
		for(int i=0; i<size; i++)
		{
			if((arr[i] != 0) || ((arr[i] != 0)&&(i == size-1)))
			{
				partsSize++;
			}
			if(arr[i] == 0 || i == size-1)
			{
				if(partsSize!=0)
				{
					partsArr[j++] = partsSize;
				}
				partsSize = 0;
				continue;
			}
		}
		//Printing number of parts and parts size
		System.out.print("Parts Number is: "+partsNumb
				+ "\nParts Size are:\n{ ");
		if (partsNumb == 0)
		{
			System.out.print("No parts ");
		}
		for(int i=0; i<partsNumb; i++)
		{
			System.out.print(partsArr[i]+" ");
		}
		System.out.print("}");
	}
}
