package assignments;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		System.out.println("Please Enter number of subjects!");
		Scanner sc= new Scanner(System.in);
		int subjectsNumber = sc.nextInt();
		float totalGrade = 0;
		float totalFullMark = 0;
		float input = 0;
		float[] subjectsGrades = new float[subjectsNumber];
		float[] fullMarkGrades = new float[subjectsNumber];
		float subjectPercentage = 0;
		String result = "Passed";
		for(int i=0; i<subjectsNumber; i++)
		{
			System.out.println("Grade of subject number " + (i+1) + ": ");
			sc= new Scanner(System.in);
			subjectsGrades[i] = sc.nextFloat();
			totalGrade = totalGrade + subjectsGrades[i];
			System.out.println("The full mark of subject number " + (i+1) + ": ");
			sc= new Scanner(System.in);
			fullMarkGrades[i] = sc.nextFloat();
			totalFullMark = totalFullMark + fullMarkGrades[i];
		}
		//=============================Subjects Calculations========================
		for(int i=0; i<subjectsNumber; i++)
		{
			subjectPercentage = (subjectsGrades[i]/fullMarkGrades[i])*100;
			System.out.println("Percentage grade of subject number " + (i+1) + ": " + subjectPercentage);
			if (subjectPercentage>=50)
			{
				System.out.println("Student passed in subject number " + (i+1));
			}
			else
				System.out.println("Student failed in subject number " + (i+1));
		}
		//=========================Total Grades Calculations========================
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
