package assignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		System.out.println("Please Enter number of subjects!");
		Scanner sc= new Scanner(System.in);
		float subjectsNumber = sc.nextFloat();
		float totalGrade = 0;
		float totalFullMark = 0;
		float input = 0;
		String result = "Passed";
		//===================================================
		for(int i=0; i<subjectsNumber; i++)
		{
			System.out.println("Grade of subject number " + (i+1) + ": ");
			sc= new Scanner(System.in);
			input = sc.nextFloat();
			totalGrade = totalGrade + input;
			System.out.println("The full mark of subject number " + (i+1) + ": ");
			sc= new Scanner(System.in);
			input = sc.nextFloat();
			totalFullMark = totalFullMark + input;
		}
		//==========================================================
		float percentage = (float) (((totalGrade)/totalFullMark)*100);
		float average = (float) ((totalGrade)/subjectsNumber);
		if (percentage<50)
			result = "Failed";
		else
			result = "Passed";
		System.out.println("Total percentage is: " + percentage
				+ "\nAverage degree is: "+ average
				+ "\nStudent total result: "+ result);
	}

}
