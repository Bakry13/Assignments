package assignments;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		System.out.println("Please Enter your subjects grades!"+"\nSubject number1: ");
		Scanner sc= new Scanner(System.in);
		float subject1 = sc.nextFloat();
		System.out.println("Subject number2: ");
		sc= new Scanner(System.in);
		float subject2 = sc.nextFloat();
		System.out.println("Subject number3: ");
		sc= new Scanner(System.in);
		float subject3 = sc.nextFloat();
		float result = ((subject1+subject2+subject2));
		float percentage = (float) (((subject1+subject2+subject3)/250)*100.0);
		float average = (float) ((subject1+subject2+subject3)/3.0);
		System.out.println("Total percentage is: " + percentage
				+ "\nAverage degree is: "+ average);
	}
}
